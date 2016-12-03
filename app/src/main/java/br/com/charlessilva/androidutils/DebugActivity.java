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

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Charles on 03/12/2016.
 */

/*  Método de ciclo de vida da Activity - Imprime logs */
public class DebugActivity extends Activity {

    protected static final String TAG = "AndroidUtils";
        protected void onCreate(Bundle icicle) {
            super.onCreate(icicle);

            Log.i(TAG, getClassName() + ".onCreate() chamado: " + icicle);
        }
        protected void onStart() {
            super.onStart();
            Log.i(TAG, getClassName() + ".onStart() chamado.");
        }
        protected void onRestart() {
            super.onRestart();
            Log.i(TAG, getClassName() + ".onRestart() chamado.");
        }
        protected void onResume() {
            super.onResume();
            Log.i(TAG, getClassName() + ".onResume() chamado.");
        }
        protected void onPause() {
            super.onPause();
            Log.i(TAG, getClassName() + ".onPause() chamado.");
        }
        @Override
        protected void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            Log.i(TAG, getClassName() + ".onSaveInstanceState() chamado.");
        }
        protected void onStop() {
            super.onStop();
            Log.i(TAG, getClassName() + ".onStop() chamado.");
        }
        protected void onDestroy() {
            super.onDestroy();
            Log.i(TAG, getClassName() + ".onDestroy() chamado.");
        }
        private String getClassName() {
            // Retorna o nome da classe sem o pacote
            String s = getClass().getName();
            return s.substring(s.lastIndexOf("."));
        }
}
