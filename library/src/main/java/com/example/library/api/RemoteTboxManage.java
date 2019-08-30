package com.example.library.api;

import android.content.Context;

import com.example.library.bean.CodeBean;
import com.example.library.bean.QueryForTasksBean;
import com.example.library.bean.QueryUpgradeFilesBean;
import com.example.library.bean.ReportVehicleResponseBean;
import com.example.library.callback.JsonCallback;
import com.example.library.configs.DataBackResult;
import com.example.library.configs.OkHelper;
import com.example.library.configs.URLConfig;
import com.example.library.interfaces.ResponseCallback;
import com.lzy.okgo.model.Response;

import java.io.File;

public class RemoteTboxManage {

    private Context context;

    public RemoteTboxManage(Context context) {
        this.context = context;
    }


    /**
     * @param vin      VIN码
     * @param TCode    终端编号
     * @param UDate    时间
     * @param Ver      大版本
     * @param callback 回调接口
     * @Description: TBox查询是否有任务（车辆零部件信息未变化）
     * @Author: XL
     * @CreateDate: 2019/8/29 6:39 PM
     */
    public void QueryForTasks(String vin, String TCode, String UDate, String Ver, final ResponseCallback<QueryForTasksBean> callback) {
        OkHelper.QueryForTasks(context, vin, TCode, UDate, Ver, new JsonCallback<DataBackResult<QueryForTasksBean>>() {
            @Override
            public void onSuccess(Response<DataBackResult<QueryForTasksBean>> response) {
                switch (response.body().getStatusCode()) {
                    case OkHelper.SUCCESS:
                        callback.onSuccess(response.body().getBody());
                        break;
                    case OkHelper.ERRO_NOT_FOUNT:
                        callback.onError(OkHelper.ERRO_NOT_FOUNT_MESSAGE);
                        break;
                    case OkHelper.ERRO_SERVER:
                        callback.onError(OkHelper.ERRO_SERVER_MESSAGE);
                        break;
                    case OkHelper.ERRO_UPTATE:
                        callback.onError(OkHelper.ERRO_UPTATE_MESSAGE);
                        break;
                    default:
                        callback.onError(OkHelper.ERRO_NOT_MESSAGE);
                        break;
                }

            }

            @Override
            public void onError(Response<DataBackResult<QueryForTasksBean>> response) {
                super.onError(response);
                callback.onError(OkHelper.errorMsg);
            }
        });
    }


    /**
     * @param json 上报信息bean
     * @Description: TBox上报车辆信息，查询是否有任务，返回升级信息
     * @Author: XL
     * @CreateDate: 2019/8/23 10:50 AM
     */
    public void ReportVehicleInformation(String json, final ResponseCallback<ReportVehicleResponseBean> callback) {
        OkHelper.ReportVehicleInformation(context, json, new JsonCallback<DataBackResult<ReportVehicleResponseBean>>() {
            @Override
            public void onSuccess(Response<DataBackResult<ReportVehicleResponseBean>> response) {
                switch (response.body().getStatusCode()) {
                    case OkHelper.SUCCESS:
                        callback.onSuccess(response.body().getBody());
                        break;
                    case OkHelper.ERRO_NOT_FOUNT:
                        callback.onError(OkHelper.ERRO_NOT_FOUNT_MESSAGE);
                        break;
                    case OkHelper.ERRO_SERVER:
                        callback.onError(OkHelper.ERRO_SERVER_MESSAGE);
                        break;
                    case OkHelper.ERRO_UPTATE:
                        callback.onError(OkHelper.ERRO_UPTATE_MESSAGE);
                        break;
                    default:
                        callback.onError(OkHelper.ERRO_NOT_MESSAGE);
                        break;
                }
            }

            @Override
            public void onError(Response<DataBackResult<ReportVehicleResponseBean>> response) {
                super.onError(response);
                callback.onError(OkHelper.errorMsg);
            }
        });
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
    public void QueryUpgradeFiles(String TCode, String VIN, String TaskCarID, String UDate, final ResponseCallback<QueryUpgradeFilesBean> callback) {
        OkHelper.QueryUpgradeFiles(context, TCode, VIN, TaskCarID, UDate, new JsonCallback<DataBackResult<QueryUpgradeFilesBean>>() {
            @Override
            public void onSuccess(Response<DataBackResult<QueryUpgradeFilesBean>> response) {
                switch (response.body().getStatusCode()) {
                    case OkHelper.SUCCESS:
                        callback.onSuccess(response.body().getBody());
                        break;
                    case OkHelper.ERRO_NOT_FOUNT:
                        callback.onError(OkHelper.ERRO_NOT_FOUNT_MESSAGE);
                        break;
                    case OkHelper.ERRO_SERVER:
                        callback.onError(OkHelper.ERRO_SERVER_MESSAGE);
                        break;
                    case OkHelper.ERRO_UPTATE:
                        callback.onError(OkHelper.ERRO_UPTATE_MESSAGE);
                        break;
                    default:
                        callback.onError(OkHelper.ERRO_NOT_MESSAGE);
                        break;
                }
            }

            @Override
            public void onError(Response<DataBackResult<QueryUpgradeFilesBean>> response) {
                super.onError(response);
                callback.onError(OkHelper.errorMsg);
            }
        });

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
    public String getDownloadUpgradeFilesUrl(String TCode, String VIN, String TaskCarID, String UDate, String FileId) {

        return URLConfig.f3 + "/?" + "TCode=" + TCode + "&VIN=" + VIN + "&TaskCarId=" + TaskCarID + "&UDate=" + UDate + "&FileId=" + FileId;
    }


    /**
     * @param json 上报信息bean
     * @Description: TBox上报任务执行过程日志
     * @Author: XL
     * @CreateDate: 2019/8/30 5:24 PM
     */
    public void UploadProcessLog(String json, final ResponseCallback<String> callback) {
        OkHelper.UploadProcessLog(context, json, new JsonCallback<DataBackResult<CodeBean>>() {
            @Override
            public void onSuccess(Response<DataBackResult<CodeBean>> response) {
                switch (response.body().getStatusCode()) {
                    case OkHelper.SUCCESS:
                        if (response.body().getBody().getCode() == 1) {
                            callback.onSuccess("上传日志成功");
                        } else {
                            callback.onSuccess("上传日志失败");
                        }
                        break;
                    case OkHelper.ERRO_NOT_FOUNT:
                        callback.onError(OkHelper.ERRO_NOT_FOUNT_MESSAGE);
                        break;
                    case OkHelper.ERRO_SERVER:
                        callback.onError(OkHelper.ERRO_SERVER_MESSAGE);
                        break;
                    case OkHelper.ERRO_UPTATE:
                        callback.onError(OkHelper.ERRO_UPTATE_MESSAGE);
                        break;
                    default:
                        callback.onError(OkHelper.ERRO_NOT_MESSAGE);
                        break;
                }
            }

            @Override
            public void onError(Response<DataBackResult<CodeBean>> response) {
                super.onError(response);
                callback.onError(OkHelper.errorMsg);
            }
        });

    }

    /**
     * @Description: 整车升级任务完成后，TBox上传日志
     * @Author: XL
     * @CreateDate: 2019/8/29 6:24 PM
     */
    public void UploadResultLog(String json, File file, final ResponseCallback<String> callback) {
        OkHelper.UploadResultLog(context, json, file, new JsonCallback<DataBackResult<CodeBean>>() {
            @Override
            public void onSuccess(Response<DataBackResult<CodeBean>> response) {
                switch (response.body().getStatusCode()) {
                    case OkHelper.SUCCESS:
                        if (response.body().getBody().getCode() == 1) {
                            callback.onSuccess("上传日志成功");
                        } else {
                            callback.onSuccess("上传日志失败");
                        }
                        break;
                    case OkHelper.ERRO_NOT_FOUNT:
                        callback.onError(OkHelper.ERRO_NOT_FOUNT_MESSAGE);
                        break;
                    case OkHelper.ERRO_SERVER:
                        callback.onError(OkHelper.ERRO_SERVER_MESSAGE);
                        break;
                    case OkHelper.ERRO_UPTATE:
                        callback.onError(OkHelper.ERRO_UPTATE_MESSAGE);
                        break;
                    default:
                        callback.onError(OkHelper.ERRO_NOT_MESSAGE);
                        break;
                }
            }

            @Override
            public void onError(Response<DataBackResult<CodeBean>> response) {
                super.onError(response);
                callback.onError(OkHelper.errorMsg);
            }
        });

    }


}
