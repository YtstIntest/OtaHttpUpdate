package com.example.library.bean;

public class ReportVehicleResponseBean {

    /**
     * result : {"Info":{"TaskST":"20190510023716","TaskET":null,"AfterVer":null,"BeforeVer":null,"UpdateMode":3,"TaskMode":1,"TaskCarID":"88a0440e-3cbe-40ed-b3ac-b75c282ae8fd","TotalTime":0,"IsUpdateLog":0,"DownloadRC":0,"ICCContentURL":null,"UpdateTime":null,"TaskRC":0},"InfoUpdateResult":0}
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
        /**
         * Info : {"TaskST":"20190510023716","TaskET":null,"AfterVer":null,"BeforeVer":null,"UpdateMode":3,"TaskMode":1,"TaskCarID":"88a0440e-3cbe-40ed-b3ac-b75c282ae8fd","TotalTime":0,"IsUpdateLog":0,"DownloadRC":0,"ICCContentURL":null,"UpdateTime":null,"TaskRC":0}
         * InfoUpdateResult : 0
         */

        private InfoBean Info;
        private int InfoUpdateResult;

        public InfoBean getInfo() {
            return Info;
        }

        public void setInfo(InfoBean Info) {
            this.Info = Info;
        }

        public int getInfoUpdateResult() {
            return InfoUpdateResult;
        }

        public void setInfoUpdateResult(int InfoUpdateResult) {
            this.InfoUpdateResult = InfoUpdateResult;
        }

        public static class InfoBean {
            /**
             * TaskST : 20190510023716
             * TaskET : null
             * AfterVer : null
             * BeforeVer : null
             * UpdateMode : 3
             * TaskMode : 1
             * TaskCarID : 88a0440e-3cbe-40ed-b3ac-b75c282ae8fd
             * TotalTime : 0
             * IsUpdateLog : 0
             * DownloadRC : 0
             * ICCContentURL : null
             * UpdateTime : null
             * TaskRC : 0
             */

            private String TaskST;
            private String TaskET;
            private String AfterVer;
            private String BeforeVer;
            private int UpdateMode;
            private int TaskMode;
            private String TaskCarID;
            private int TotalTime;
            private int IsUpdateLog;
            private int DownloadRC;
            private String ICCContentURL;
            private String UpdateTime;
            private int TaskRC;

            public String getTaskST() {
                return TaskST;
            }

            public void setTaskST(String TaskST) {
                this.TaskST = TaskST;
            }

            public Object getTaskET() {
                return TaskET;
            }

            public void setTaskET(String TaskET) {
                this.TaskET = TaskET;
            }

            public Object getAfterVer() {
                return AfterVer;
            }

            public void setAfterVer(String AfterVer) {
                this.AfterVer = AfterVer;
            }

            public Object getBeforeVer() {
                return BeforeVer;
            }

            public void setBeforeVer(String BeforeVer) {
                this.BeforeVer = BeforeVer;
            }

            public int getUpdateMode() {
                return UpdateMode;
            }

            public void setUpdateMode(int UpdateMode) {
                this.UpdateMode = UpdateMode;
            }

            public int getTaskMode() {
                return TaskMode;
            }

            public void setTaskMode(int TaskMode) {
                this.TaskMode = TaskMode;
            }

            public String getTaskCarID() {
                return TaskCarID;
            }

            public void setTaskCarID(String TaskCarID) {
                this.TaskCarID = TaskCarID;
            }

            public int getTotalTime() {
                return TotalTime;
            }

            public void setTotalTime(int TotalTime) {
                this.TotalTime = TotalTime;
            }

            public int getIsUpdateLog() {
                return IsUpdateLog;
            }

            public void setIsUpdateLog(int IsUpdateLog) {
                this.IsUpdateLog = IsUpdateLog;
            }

            public int getDownloadRC() {
                return DownloadRC;
            }

            public void setDownloadRC(int DownloadRC) {
                this.DownloadRC = DownloadRC;
            }

            public Object getICCContentURL() {
                return ICCContentURL;
            }

            public void setICCContentURL(String ICCContentURL) {
                this.ICCContentURL = ICCContentURL;
            }

            public Object getUpdateTime() {
                return UpdateTime;
            }

            public void setUpdateTime(String UpdateTime) {
                this.UpdateTime = UpdateTime;
            }

            public int getTaskRC() {
                return TaskRC;
            }

            public void setTaskRC(int TaskRC) {
                this.TaskRC = TaskRC;
            }
        }
    }
}
