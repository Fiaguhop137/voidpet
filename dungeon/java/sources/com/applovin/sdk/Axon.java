package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.applovin.impl.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class Axon {
    public static final String VERSION = "1.3.2";

    public interface InitializationListener {
        void onInitialized();
    }

    public static Axon getInstance(@NonNull Context context) {
        return p.b(context);
    }

    public abstract AxonEventService getEventService();

    public abstract AxonUserData getUserData();

    public abstract void initialize(@NonNull AxonInitializationConfiguration axonInitializationConfiguration, InitializationListener initializationListener);

    public abstract boolean isDebuggerEnabled();

    public abstract boolean isVerboseLoggingEnabled();

    public abstract void processDeepLink(@NonNull Uri uri);

    public abstract void setDebuggerEnabled(boolean z10);

    public abstract void setUserData(AxonUserData axonUserData);

    public abstract void setVerboseLoggingEnabled(boolean z10);
}
