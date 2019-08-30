package com.example.library.interfaces;

public interface ResponseCallback<T> {
    void onSuccess(T bean);

    void onError(String msg);
}
