package com.example.library.bean;

import java.util.List;

public class UploadProcessLogBean{


    /**
     * header : {"vin":"Test2019030000001","TCode":"8000001","TaskCarID":"D3C2ED82-4EF5-43AA-9DD2-B130CEC37520","Ver":null,"BVer":"","UDate":"20190316111111"}
     * L0 : [{"PCode":"L0","UDate":"20190327120000"}]
     * L1 : [{"PCode":"L1","UDate":"20190327120000"}]
     * L2 : [{"PCode":"L2","UDate":"20190327120010","ICC":{"process":"10","rc":"0"},"backup":{"process":"10","rc":"0"},"car":{"process":"10","rc":"0"},"DType":"1"}]
     * L3 : [{"PCode":"L3","UDate":"20190327120010","Data":"100"}]
     * L4 : [{"PCode":"L4","UDate":"20190327120010"}]
     * L5 : [{"PCode":"L5","UDate":"20190327120010","UState":"2","UTime":"20190401"}]
     * L6 : [{"PCode":"L6","UDate":"20190327120010","Reason":"1","Msg":""}]
     * L7 : [{"PCode":"L7","UDate":"20190327120010","Reason":"1"}]
     * L8 : [{"PCode":"L8","UDate":"20190327120010","Type":"0","Data":[{"Name":"ECC","Process":"10","RC":"0"}]}]
     * L9 : [{"PCode":"L9","UDate":"20190327120010","Data":"100"}]
     */

    private HeaderBean header;
    private List<L0Bean> L0;
    private List<L1Bean> L1;
    private List<L2Bean> L2;
    private List<L3Bean> L3;
    private List<L4Bean> L4;
    private List<L5Bean> L5;
    private List<L6Bean> L6;
    private List<L7Bean> L7;
    private List<L8Bean> L8;
    private List<L9Bean> L9;

    public HeaderBean getHeader() {
        return header;
    }

    public void setHeader(HeaderBean header) {
        this.header = header;
    }

    public List<L0Bean> getL0() {
        return L0;
    }

    public void setL0(List<L0Bean> l0) {
        L0 = l0;
    }

    public List<L1Bean> getL1() {
        return L1;
    }

    public void setL1(List<L1Bean> L1) {
        this.L1 = L1;
    }

    public List<L2Bean> getL2() {
        return L2;
    }

    public void setL2(List<L2Bean> L2) {
        this.L2 = L2;
    }

    public List<L3Bean> getL3() {
        return L3;
    }

    public void setL3(List<L3Bean> L3) {
        this.L3 = L3;
    }

    public List<L4Bean> getL4() {
        return L4;
    }

    public void setL4(List<L4Bean> L4) {
        this.L4 = L4;
    }

    public List<L5Bean> getL5() {
        return L5;
    }

    public void setL5(List<L5Bean> L5) {
        this.L5 = L5;
    }

    public List<L6Bean> getL6() {
        return L6;
    }

    public void setL6(List<L6Bean> L6) {
        this.L6 = L6;
    }

    public List<L7Bean> getL7() {
        return L7;
    }

    public void setL7(List<L7Bean> L7) {
        this.L7 = L7;
    }

    public List<L8Bean> getL8() {
        return L8;
    }

    public void setL8(List<L8Bean> L8) {
        this.L8 = L8;
    }

    public List<L9Bean> getL9() {
        return L9;
    }

    public void setL9(List<L9Bean> L9) {
        this.L9 = L9;
    }

    public static class HeaderBean {
        /**
         * vin : Test2019030000001
         * TCode : 8000001
         * TaskCarID : D3C2ED82-4EF5-43AA-9DD2-B130CEC37520
         * Ver : null
         * BVer :
         * UDate : 20190316111111
         */

        private String vin;
        private String TCode;
        private String TaskCarID;
        private String  Ver;
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

        public String getVer() {
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
    public static class L0Bean {
        /**
         * PCode : L0
         * UDate : 20190327120000
         */

        private String PCode;
        private String UDate;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }
    }

    public static class L1Bean {
        /**
         * PCode : L1
         * UDate : 20190327120000
         */

        private String PCode;
        private String UDate;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }
    }

    public static class L2Bean {
        /**
         * PCode : L2
         * UDate : 20190327120010
         * ICC : {"process":"10","rc":"0"}
         * backup : {"process":"10","rc":"0"}
         * car : {"process":"10","rc":"0"}
         * DType : 1
         */

        private String PCode;
        private String UDate;
        private ICCBean ICC;
        private BackupBean backup;
        private CarBean car;
        private String DType;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }

        public ICCBean getICC() {
            return ICC;
        }

        public void setICC(ICCBean ICC) {
            this.ICC = ICC;
        }

        public BackupBean getBackup() {
            return backup;
        }

        public void setBackup(BackupBean backup) {
            this.backup = backup;
        }

        public CarBean getCar() {
            return car;
        }

        public void setCar(CarBean car) {
            this.car = car;
        }

        public String getDType() {
            return DType;
        }

        public void setDType(String DType) {
            this.DType = DType;
        }

        public static class ICCBean {
            /**
             * process : 10
             * rc : 0
             */

            private String process;
            private String rc;

            public String getProcess() {
                return process;
            }

            public void setProcess(String process) {
                this.process = process;
            }

            public String getRc() {
                return rc;
            }

            public void setRc(String rc) {
                this.rc = rc;
            }
        }

        public static class BackupBean {
            /**
             * process : 10
             * rc : 0
             */

            private String process;
            private String rc;

            public String getProcess() {
                return process;
            }

            public void setProcess(String process) {
                this.process = process;
            }

            public String getRc() {
                return rc;
            }

            public void setRc(String rc) {
                this.rc = rc;
            }
        }

        public static class CarBean {
            /**
             * process : 10
             * rc : 0
             */

            private String process;
            private String rc;

            public String getProcess() {
                return process;
            }

            public void setProcess(String process) {
                this.process = process;
            }

            public String getRc() {
                return rc;
            }

            public void setRc(String rc) {
                this.rc = rc;
            }
        }
    }

    public static class L3Bean {
        /**
         * PCode : L3
         * UDate : 20190327120010
         * Data : 100
         */

        private String PCode;
        private String UDate;
        private String Data;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }

        public String getData() {
            return Data;
        }

        public void setData(String Data) {
            this.Data = Data;
        }
    }

    public static class L4Bean {
        /**
         * PCode : L4
         * UDate : 20190327120010
         */

        private String PCode;
        private String UDate;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }
    }

    public static class L5Bean {
        /**
         * PCode : L5
         * UDate : 20190327120010
         * UState : 2
         * UTime : 20190401
         */

        private String PCode;
        private String UDate;
        private String UState;
        private String UTime;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }

        public String getUState() {
            return UState;
        }

        public void setUState(String UState) {
            this.UState = UState;
        }

        public String getUTime() {
            return UTime;
        }

        public void setUTime(String UTime) {
            this.UTime = UTime;
        }
    }

    public static class L6Bean {
        /**
         * PCode : L6
         * UDate : 20190327120010
         * Reason : 1
         * Msg :
         */

        private String PCode;
        private String UDate;
        private String Reason;
        private String Msg;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }

        public String getReason() {
            return Reason;
        }

        public void setReason(String Reason) {
            this.Reason = Reason;
        }

        public String getMsg() {
            return Msg;
        }

        public void setMsg(String Msg) {
            this.Msg = Msg;
        }
    }

    public static class L7Bean {
        /**
         * PCode : L7
         * UDate : 20190327120010
         * Reason : 1
         */

        private String PCode;
        private String UDate;
        private String Reason;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }

        public String getReason() {
            return Reason;
        }

        public void setReason(String Reason) {
            this.Reason = Reason;
        }
    }

    public static class L8Bean {
        /**
         * PCode : L8
         * UDate : 20190327120010
         * Type : 0
         * Data : [{"Name":"ECC","Process":"10","RC":"0"}]
         */

        private String PCode;
        private String UDate;
        private String Type;
        private List<DataBean> Data;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }

        public String getType() {
            return Type;
        }

        public void setType(String Type) {
            this.Type = Type;
        }

        public List<DataBean> getData() {
            return Data;
        }

        public void setData(List<DataBean> Data) {
            this.Data = Data;
        }

        public static class DataBean {
            /**
             * Name : ECC
             * Process : 10
             * RC : 0
             */

            private String Name;
            private String Process;
            private String RC;

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getProcess() {
                return Process;
            }

            public void setProcess(String Process) {
                this.Process = Process;
            }

            public String getRC() {
                return RC;
            }

            public void setRC(String RC) {
                this.RC = RC;
            }
        }
    }

    public static class L9Bean {
        /**
         * PCode : L9
         * UDate : 20190327120010
         * Data : 100
         */

        private String PCode;
        private String UDate;
        private String Data;

        public String getPCode() {
            return PCode;
        }

        public void setPCode(String PCode) {
            this.PCode = PCode;
        }

        public String getUDate() {
            return UDate;
        }

        public void setUDate(String UDate) {
            this.UDate = UDate;
        }

        public String getData() {
            return Data;
        }

        public void setData(String Data) {
            this.Data = Data;
        }
    }
}
