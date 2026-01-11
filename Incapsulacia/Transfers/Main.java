package Transfers;

public class Main {
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.apply(1, 2));
        System.out.println(Operation.MINUS.apply(4, 2));
        System.out.println(Operation.MULTIPLY.apply(5, 2));
        System.out.println(Operation.DIVIDE.apply(9, 2));
    }

    enum Operation {
        PLUS(1) {
            @Override
            public int apply(int x, int y) {
                return x + y;
            }
        },
        MINUS(2) {
            @Override
            public int apply(int x, int y) {
                return x - y;
            }
        },
        MULTIPLY(3) {
            @Override
            public int apply(int x, int y) {
                return x * y;
            }
        },
        DIVIDE(4) {
            @Override
            public int apply(int x, int y) {
                return x / y;
            }
        };

        private final int code;

        Operation(int code) {
            this.code = code;
        }

        public abstract int apply(int x, int y);

        public int getCode() {
            return code;
        }

        public static int calculate(int x, int y, int opCode) {
            for (Operation operation : values()) {
                if (operation.code == opCode) {
                    return operation.apply(x, y);
                }
            }
            return 0;
        }
    }
}
