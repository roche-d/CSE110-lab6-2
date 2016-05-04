package com.cse110.lab6.bind_service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

import java.io.FileDescriptor;

public class DemoBindService extends Service {
    private final IBinder iBinder = new LocalService();

    public DemoBindService() {
    }

    final class LocalService extends Binder {

        public DemoBindService getService() {
            return DemoBindService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }

    public String getFirstMessage() {
        return "this is the first message";
    }

    public String getSecondMessage() {
        return "this is the second message";
    }
}
