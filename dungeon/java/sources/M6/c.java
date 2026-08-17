package M6;

import com.facebook.react.bridge.WritableArray;

/* JADX INFO: loaded from: classes2.dex */
public interface c {
    void callIdleCallbacks(double d10);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}
