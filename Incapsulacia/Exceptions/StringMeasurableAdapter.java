package Exceptions;

class StringMeasurableAdapter extends Line implements Line.Measurable {
    private String text;

    public StringMeasurableAdapter(String text) {
        this.text = text;
    }

    @Override
    public double length() {
        if (text == null) {
            return 0.0;
        }
        return (double) text.length();
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "StringAdapter[\"" + (text != null ? text : "") + "\"]";
    }
}

