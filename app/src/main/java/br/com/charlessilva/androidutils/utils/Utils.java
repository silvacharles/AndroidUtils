/*
 * *
 *  *     / )|                                   |( \
 *  *    / / |         Charles Silva             | \ \
 *  *  _( (_ |  _  [www.charlessilva.com.br]  _  | _) )_
 *  * (((\ \)|_/ )___________________________( \_|(/ /)))
 *  * (\\\\ \_/ /                             \ \_/ ////)
 *  *  \       /                               \       /
 *  *   \    _/                                 \_    /
 *  *   /   /                                     \   \
 *  * Autor   : Charles Silva (suporte@charlessilva.com.br)
 *  * Linguagem : Java (SDK Android) IDE: Android Studio
 *  * URL: www.charlessilva.com.br
 *  * twitter: http://twitter.com/charlessilva_
 *  * GitHub: https://github.com/silvacharles
 *
 */

package br.com.charlessilva.androidutils.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Environment;
import android.util.Log;

/**
 * Created by Charles on 03/12/2016.
 */

public class Utils {
    private Context context;
    private static final String TAG = Utils.class.getSimpleName();

    public Utils(Context context) {
        this.context = context;
    }

    // Verifica se está Online
    public boolean isOnline() {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        return manager.getActiveNetworkInfo() != null &&
                manager.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    // Verifica se está conectado á Internet com relatório de Erro
    public boolean isConexaoInternet() {
        boolean connected = false;
        try {
            ConnectivityManager conn = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
            if (conn.getActiveNetworkInfo() != null
                    && conn.getActiveNetworkInfo().isAvailable()
                    && conn.getActiveNetworkInfo().isConnected()) {
                connected = true;
            }
        } catch (Exception e) {
            Log.d(TAG, "Erro na Conexão " + e + " Leia Mensagem " + e.getMessage());
        }
        return connected;
    }

    // Verifica se de armazenamento externo está disponível para leitura e gravação
    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    // Verifica se de armazenamento externo está disponível para ler
    public boolean isExternalStorageReadable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) ||
                Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return true;
        }
        return false;
    }
}

