package com.example.moviles1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class modoAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean avion = intent.getBooleanExtra("state", false);

        if (avion) {
            // Modo avión ACTIVADO
            Toast.makeText(context, "✈️ El modo avión se activó", Toast.LENGTH_SHORT).show();

            // Intent para abrir app de llamadas
            Intent llamada = new Intent(Intent.ACTION_DIAL);
            llamada.setData(Uri.parse("tel:2664553747"));
            llamada.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(llamada);

        } else {
            // Modo avión DESACTIVADO
            Toast.makeText(context, "📶 El modo avión se desactivó", Toast.LENGTH_SHORT).show();
        }
    }
}
