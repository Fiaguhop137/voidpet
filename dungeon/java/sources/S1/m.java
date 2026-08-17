package S1;

import U1.AbstractC1459a;
import U1.AbstractC1460b;
import U1.AbstractC1477t;
import U1.C1469k;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AudioManager f11440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f11441b;

    public static /* synthetic */ void a(Context context, C1469k c1469k) {
        f11440a = (AudioManager) context.getSystemService("audio");
        c1469k.f();
    }

    public static int b(AudioManager audioManager, g gVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.abandonAudioFocusRequest(gVar.c()) : audioManager.abandonAudioFocus(gVar.f());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            Context applicationContext = context.getApplicationContext();
            if (f11441b != applicationContext) {
                f11440a = null;
            }
            AudioManager audioManager = f11440a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                C1469k c1469k = new C1469k();
                AbstractC1460b.a().execute(new l(applicationContext, c1469k));
                c1469k.b();
                return (AudioManager) AbstractC1459a.e(f11440a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService("audio");
            f11440a = audioManager2;
            return (AudioManager) AbstractC1459a.e(audioManager2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int e(AudioManager audioManager, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioManager.getStreamMinVolume(i10);
        }
        return 0;
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            AbstractC1477t.i("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean g(AudioManager audioManager, int i10) {
        return audioManager.isStreamMute(i10);
    }

    public static int h(AudioManager audioManager, g gVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.requestAudioFocus(gVar.c()) : audioManager.requestAudioFocus(gVar.f(), gVar.b().b(), gVar.e());
    }
}
