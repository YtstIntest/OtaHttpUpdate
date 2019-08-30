package com.example.library.bean;

import java.util.List;

public class ReportVehicleInformationBean {


    /**
     * header : {"vin":"TEST2000000000000","TCode":"8000002","TaskCarID":"","Ver":null,"BVer":"","UDate":"20190316111111"}
     * Ecus : [{"Na":"BMS","Sv":"S002C111","Hv":"E00108087","Pn":"E00108087"}]
     */

    private HeaderBean header;
    private List<EcusBean> Ecus;

    public HeaderBean getHeader() {
        return header;
    }

    public void setHeader(HeaderBean header) {
        this.header = header;
    }

    public List<EcusBean> getEcus() {
        return Ecus;
    }

    public void setEcus(List<EcusBean> Ecus) {
        this.Ecus = Ecus;
    }

    public static class HeaderBean {
        /**
         * vin : TEST2000000000000
         * TCode : 8000002
         * TaskCarID :
         * Ver : null
         * BVer :
         * UDate : 20190316111111
         */

        private String vin;
        private String TCode;
        private String TaskCarID;
        private String Ver;
        private String BVer;
        private String UDate;

        public String getVin() {
            return vin;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }

        public String getTCode() {
            return TCode;
        }

        public void setTCode(String TCode) {
            this.TCode = TCode;
        }

        public String getTaskCarID() {
            return TaskCarID;
        }

        public void setTaskCarID(String TaskCarID) {
            this.TaskCarID = TaskCarID;
        }

        public Object getVer() {
            return Ver;
        }

        public void setVer(String Ver) {
            this.Ver = Ver;
        }

        public String getBVer() {
            return BVer;
        }

        public void setBVer(String BVer) {
            this.BVer = BVer;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }
    }

    public static class EcusBean {
        /**
         * Na : BMS
         * Sv : S002C111
         * Hv : E00108087
         * Pn : E00108087
         */

        private String Na;
        private String Sv;
        private String Hv;
        private String Pn;

        public String getNa() {
            return Na;
        }

        public void setNa(String Na) {
            this.Na = Na;
        }

        public String getSv() {
            return Sv;
        }

        public void setSv(String Sv) {
            this.Sv = Sv;
        }

        public String getHv() {
            return Hv;
        }

        public void setHv(String Hv) {
            this.Hv = Hv;
        }

        public String getPn() {
            return Pn;
        }

        public void setPn(String Pn) {
            this.Pn = Pn;
        }
    }
}
