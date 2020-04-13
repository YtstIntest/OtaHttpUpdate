package com.example.library.configs;


import android.content.Context;

import com.example.library.bean.CodeBean;
import com.example.library.bean.QueryForTasksBean;
import com.example.library.bean.QueryUpgradeFilesBean;
import com.example.library.bean.ReportVehicleResponseBean;
import com.example.library.callback.JsonCallback;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;

import java.io.File;
import java.util.Observable;

public class OkHelper extends Observable {
    public static final int SUCCESS = 200;


    public static final int ERRO_NOT_FOUNT = 404;
    public static String ERRO_NOT_FOUNT_MESSAGE = "未找到请求路由，多用于下载文件时，文件不存在或文件不能被下载";

    public static final int ERRO_SERVER = 500;
    public static String ERRO_SERVER_MESSAGE = "服务端错误";

    public static final int ERRO_UPTATE = 206;
    public static String ERRO_UPTATE_MESSAGE = "下载部分文件时，成功响应";

    public static String ERRO_NOT_MESSAGE = "未知错误";

    public static String errorMsg = "加载异常，请重试！！！";


    /**
     * @param vin   VIN码
     * @param TCode 终端编号
     * @param UDate 时间
     * @param Ver   大版本
     * @Description: TBox查询是否有任务（车辆零部件信息未变化）
     * @Author: XL
     * @CreateDate: 2019/8/23 10:47 AM
     */
    public static void QueryForTasks(Context context, String vin, String TCode, String UDate, String Ver, JsonCallback<DataBackResult<QueryForTasksBean>> callback) {
        OkGo.<DataBackResult<QueryForTasksBean>>get(URLConfig.f0)
                .tag(context)
                .cacheMode(CacheMode.NO_CACHE)
                .params("vin", vin)
                .params("TCode", TCode)
                .params("UDate", UDate)
                .params("Ver", Ver)
                .execute(callback);
    }


    /**
     * @param json 上报信息bean
     * @Description: TBox上报车辆信息，查询是否有任务，返回升级信息
     * @Author: XL
     * @CreateDate: 2019/8/23 10:50 AM
     */
    public static void ReportVehicleInformation(Context context, String json, JsonCallback<DataBackResult<ReportVehicleResponseBean>> callback) {
        OkGo.<DataBackResult<ReportVehicleResponseBean>>post(URLConfig.f1)
                .tag(context)
                .cacheMode(CacheMode.NO_CACHE)
                .upJson(json)
                .execute(callback);
    }


    /**
     * @param TCode     终端编号
     * @param VIN       VIN码
     * @param TaskCarID 车辆任务ID
     * @param UDate     日期时间
     * @Description: TBox查询升级文件是否可以下载
     * @Author: XL
     * @CreateDate: 2019/8/23 11:01 AM
     */
    public static void QueryUpgradeFiles(Context context, String TCode, String VIN, String TaskCarID, String UDate, JsonCallback<DataBackResult<QueryUpgradeFilesBean>> callback) {
        OkGo.<DataBackResult<QueryUpgradeFilesBean>>get(URLConfig.f2)
                .tag(context)
                .cacheMode(CacheMode.NO_CACHE)
                .params("TCode", TCode)
                .params("VIN", VIN)
                .params("TaskCarID", TaskCarID)
                .params("UDate", UDate)
                .execute(callback);
    }

    /**
     * @param TCode     终端编号
     * @param VIN       VIN码
     * @param TaskCarID 车辆任务ID
     * @param UDate     日期时间
     * @param FileId    下载文件的Id
     * @Description: TBox下载升级文件
     * @Author: XL
     * @CreateDate: 2019/8/28 2:05 PM
     */
    public static void DownloadUpgradeFiles(Context context, String TCode, String VIN, String TaskCarID, String UDate, String FileId) {


    }


    /**
     * @param json 上报信息bean
     * @Description: TBox上报任务执行过程日志
     * @Author: XL
     * @CreateDate: 2019/8/30 5:24 PM
     */
    public static void UploadProcessLog(Context context, String json, JsonCallback<DataBackResult<CodeBean>> callback) {
        OkGo.<DataBackResult<CodeBean>>post(URLConfig.f5)
                .tag(context)
                .cacheMode(CacheMode.NO_CACHE)
                .upJson(json)
                .execute(callback);

    }


    /**
     * @Description: 整车升级任务完成后，TBox上传日志
     * @Author: XL
     * @CreateDate: 2019/8/29 6:24 PM
     */
    public static void UploadResultLog(Context context, String json, File file, JsonCallback<DataBackResult<CodeBean>> callback) {
        OkGo.<DataBackResult<CodeBean>>post(URLConfig.f5)
                .tag(context)
                .isMultipart(true)
                .cacheMode(CacheMode.NO_CACHE)
                .upJson(json)
                .upFile(file)
                .execute(callback);
    }


}
