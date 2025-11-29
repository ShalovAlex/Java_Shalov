package tests7;

class Fraction {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) obj;
        return num == fraction.num && denum == fraction.denum;
    }

    @Override
    public int hashCode() {
        return 31 * num + denum;
    }
    @Override
    public Fraction clone() {
        return new Fraction(this.num, this.denum);
    }
}

