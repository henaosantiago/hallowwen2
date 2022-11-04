package org.example.clasesHalloween;



    // CONSTRUCTOR

    public class Fiesta {
        //ATRIBUTOS
        private String fecha;

        private double costosAlimentos;
        private double costosBebidas;
        private double costosLugar;
        private double costosEquipos;

        private final double VALOR_ENTRADA=50000;

        // CONSTRUCTOR

        public Fiesta() {
        }

        public Fiesta(String fecha) {
            this.fecha = fecha;

        }

        //METODOS

        //METODOS DE ENCAPSULADO
        //(para acceder a modificar o mostrar nuestros atributos privados)


        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public double getCostosAlimentos() {
            return costosAlimentos;
        }

        public void setCostosAlimentos(double costosAlimentos) {
            if (costosAlimentos>0){
                this.costosAlimentos = costosAlimentos;
            }else {
                System.out.println("NO ACEPTAMOS VALORES NEGATIVOS");
            }
            this.costosAlimentos = costosAlimentos;
        }

        public double getCostosBebidas() {
            return costosBebidas;
        }

        public void setCostosBebidas(double costosBebidas) {
            if (costosBebidas>0){
                this.costosBebidas = costosBebidas;
            }else {
                System.out.println("NO ACEPTAMOS VALORES NEGATIVOS");
            }
            this.costosBebidas = costosBebidas;
        }



        public double getCostosLugar() {
            return costosLugar;
        }

        public void setCostosLugar(double costosLugar) {
            if (costosLugar>0){
                this.costosLugar = costosLugar;
            }else {
                System.out.println("NO ACEPTAMOS VALORES NEGATIVOS");
            }
            this.costosLugar = costosLugar;
        }

        public double getCostosEquipos() {
            return costosEquipos;
        }

        public void setCostosEquipos(double costosEquipos) {
            if (costosEquipos>0){
                this.costosEquipos = costosEquipos;
            }else {
                System.out.println("NO ACEPTAMOS VALORES NEGATIVOS");
            }
            this.costosEquipos = costosEquipos;
        }

        //METODOS ORDINARIOS
        public double calcularCostos() {
            return (this.costosAlimentos+this.costosBebidas+this.costosLugar+this.costosEquipos);
        }
    }