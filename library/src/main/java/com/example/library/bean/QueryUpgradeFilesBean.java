package com.example.library.bean;

import java.util.List;

public class QueryUpgradeFilesBean {

    /**
     * result : [{"Id":"F3522B41-20E9-4F51-BC82-B0C82C70591E","Type":1,"MD5":"a2212aeab7ad024a07be8b473476a0ce","Size":93980},{"Id":"A0058405-CE4F-4200-9789-EF13E29ECBD6","Type":2,"MD5":"2ff5276ebfa4f9cc27bd82889a2036d7","Size":93980},{"Id":null,"Type":3,"MD5":null,"Size":0}]
     * code : 1
     */

    private int code;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * Id : F3522B41-20E9-4F51-BC82-B0C82C70591E
         * Type : 1
         * MD5 : a2212aeab7ad024a07be8b473476a0ce
         * Size : 93980
         */

        private String Id;
        private int Type;
        private String MD5;
        private int Size;

        public String getId() {
            return Id;
        }

        public void setId(String Id) {
            this.Id = Id;
        }

        public int getType() {
            return Type;
        }

        public void setType(int Type) {
            this.Type = Type;
        }

        public String getMD5() {
            return MD5;
        }

        public void setMD5(String MD5) {
            this.MD5 = MD5;
        }

        public int getSize() {
            return Size;
        }

        public void setSize(int Size) {
            this.Size = Size;
        }
    }
}
