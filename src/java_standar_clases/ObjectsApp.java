package java_standar_clases;

import java.util.Objects;

public class ObjectsApp {

    public static class Data{

        private String name;

        Data(String name) {
            this.name=name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return Objects.equals(name, data.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }



    public static void main(String[] args) {
        excute(new Data("wanda"));

    }


    public static void excute(Data data){
        if (data !=null){
            System.out.println(Objects.toString(data));
            System.out.println(Objects.hashCode(data));

        }
    }
}
