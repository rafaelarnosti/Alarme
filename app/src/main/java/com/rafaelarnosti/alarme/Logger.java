package com.rafaelarnosti.alarme;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Logger extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        Log.i("ServicoMensagem", "Servico Iniciado");
    }
    public void onDestroy(){
        Log.i("ServicoMensagem", "Serviço encerrado");
    }
}
