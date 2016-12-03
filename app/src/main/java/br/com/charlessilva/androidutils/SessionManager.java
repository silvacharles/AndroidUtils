package br.com.charlessilva.androidutils;

/**
 *     / )|                                   |( \
 *    / / |         Charles Silva             | \ \
 *  _( (_ |  _  [www.charlessilva.com.br]  _  | _) )_
 * (((\ \)|_/ )___________________________( \_|(/ /)))
 * (\\\\ \_/ /                             \ \_/ ////)
 *  \       /                               \       /
 *   \    _/                                 \_    /
 *   /   /                                     \   \
 * Autor   : Charles Silva (suporte@charlessilva.com.br)
 * Linguagem : Java (SDK Android) IDE: Android Studio
 * URL: www.charlessilva.com.br
 * twitter: http://twitter.com/charlessilva_
 * GitHub: https://github.com/silvacharles
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

/**
 * Created by Charles on 03/12/2016.
 */

public class SessionManager {
    // Log TAG
    private static String TAG = SessionManager.class.getSimpleName();

    // Variavel salvar preferencias
    SharedPreferences pref;
    Editor editor;
    Context contexto;
    // Grava dados
    int PRIVATE_MODE = 0;

    // seta nome do arquivo
    private static final String PREF_NAME = "charles";
    private static final String KEY_IS_LOGGEDIN = "isLoggedIn";


    public SessionManager(Context context) {
        this.contexto = context;
        pref = contexto.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setLogin(boolean isLoggedIn) {
        editor.putBoolean(KEY_IS_LOGGEDIN, isLoggedIn);
        editor.commit();

        Log.d(TAG, "Foi alterado a sessão do usuário!");
    }


    public boolean isLoggedIn(){
        return pref.getBoolean(KEY_IS_LOGGEDIN, false);
    }
}
