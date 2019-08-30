package com.example.library.bean;

import java.util.List;

public class QueryForTasksBean {


    /**
     * result : {"BusInfo":[{"Name":"VCU","PhyicalID":"7c2","FunctionID":"7DF","ResponseID":"7ca","CanPort":0,"BaudRate":500}]}
     * code : 1
     */

    private ResultBean result;
    private int code;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class ResultBean {
        private List<BusInfoBean> BusInfo;

        public List<BusInfoBean> getBusInfo() {
            return BusInfo;
        }

        public void setBusInfo(List<BusInfoBean> BusInfo) {
            this.BusInfo = BusInfo;
        }

        public static class BusInfoBean {
            /**
             * Name : VCU
             * PhyicalID : 7c2
             * FunctionID : 7DF
             * ResponseID : 7ca
             * CanPort : 0
             * BaudRate : 500
             */

            private String Name;
            private String PhyicalID;
            private String FunctionID;
            private String ResponseID;
            private int CanPort;
            private int BaudRate;

            public String getName() {
                return Name;
            }

            public void setName(String Name) {
                this.Name = Name;
            }

            public String getPhyicalID() {
                return PhyicalID;
            }

            public void setPhyicalID(String PhyicalID) {
                this.PhyicalID = PhyicalID;
            }

            public String getFunctionID() {
                return FunctionID;
            }

            public void setFunctionID(String FunctionID) {
                this.FunctionID = FunctionID;
            }

            public String getResponseID() {
                return ResponseID;
            }

            public void setResponseID(String ResponseID) {
                this.ResponseID = ResponseID;
            }

            public int getCanPort() {
                return CanPort;
            }

            public void setCanPort(int CanPort) {
                this.CanPort = CanPort;
            }

            public int getBaudRate() {
                return BaudRate;
            }

            public void setBaudRate(int BaudRate) {
                this.BaudRate = BaudRate;
            }
        }
    }
}
