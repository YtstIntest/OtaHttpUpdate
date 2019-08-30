package com.example.library.configs;

public class URLConfig {
    public static String IP = "http://192.168.1.115";


    public static String PORT = ":62072";


    public static String PORT_URl = PORT + "/api/fota/";

    public static String IP_PORT_URl = IP + PORT_URl;

    /**
     * @Description: TBox查询是否有任务（车辆零部件信息未变化）
     * @Author: XL
     * @CreateDate: 2019/8/22 5:48 PM
     */
    public static String f0 = IP_PORT_URl + "f0";


    /**
     * @Description: TBox上报车辆信息，查询是否有任务，返回升级信息
     * @Author: XL
     * @CreateDate: 2019/8/22 5:48 PM
     */
    public static String f1 = IP_PORT_URl + "f1";


    /**
     * @Description: TBox查询升级文件是否可以下载
     * @Author: XL
     * @CreateDate: 2019/8/22 5:49 PM
     */
    public static String f2 = IP_PORT_URl + "f2";


    /**
     * @Description: TBox下载升级文件
     * @Author: XL
     * @CreateDate: 2019/8/22 5:49 PM
     */
    public static String f3 = IP_PORT_URl + "f3";


    /**
     * @Description: TBox上报任务执行过程日志
     * @Author: XL
     * @CreateDate: 2019/8/29 5:48 PM
     */
    public static String f4 = IP_PORT_URl + "f4";


    /**
     * @Description: 整车升级任务完成后，TBox上传日志
     * @Author: XL
     * @CreateDate: 2019/8/29 5:48 PM
     */
    public static String f5 = IP_PORT_URl + "f5";

}
