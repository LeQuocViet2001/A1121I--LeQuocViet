package Furama.models;

    public class Contract {
        private int idContract;
        private int idBooking;
        private double deposit;  //số tiền đặt cọc
        private double totalMoney;
        private String idCustomer;

        //constructor

        public Contract() {
        }

        public Contract(int idContract, int idBooking, double deposit, double totalMoney, String idCustomer) {
            this.idContract = idContract;
            this.idBooking = idBooking;
            this.deposit = deposit;
            this.totalMoney = totalMoney;
            this.idCustomer = idCustomer;
        }

        //getter setter

        public int getIdContract() {
            return idContract;
        }

        public void setIdContract(int idContract) {
            this.idContract = idContract;
        }

        public int getIdBooking() {
            return idBooking;
        }

        public void setIdBooking(int idBooking) {
            this.idBooking = idBooking;
        }

        public double getDeposit() {
            return deposit;
        }

        public void setDeposit(double deposit) {
            this.deposit = deposit;
        }

        public double getTotalMoney() {
            return totalMoney;
        }

        public void setTotalMoney(double totalMoney) {
            this.totalMoney = totalMoney;
        }

        public String getIdCustomer() {
            return idCustomer;
        }

        public void setIdCustomer(String idCustomer) {
            this.idCustomer = idCustomer;
        }

        //xuất thông tin

        @Override
        public String toString() {
            return "Contract{" +
                    "idContract='" + idContract + '\'' +
                    ", idBooking='" + idBooking + '\'' +
                    ", deposit=" + deposit +
                    ", totalMoney=" + totalMoney +
                    ", idCustomer='" + idCustomer + '\'' +
                    '}';
        }

}


