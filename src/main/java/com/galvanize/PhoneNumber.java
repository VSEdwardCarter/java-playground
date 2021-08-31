package com.galvanize;

public class PhoneNumber {
  public enum Type {
            HOME, WORK, CELL
        }

        private Type type = Type.CELL;

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }




}
