package io.sentry.android.core.internal.tombstone;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public enum a {
    TOMBSTONE("Tombstone"),
    SIGNAL_HANDLER("signalhandler"),
    TOMBSTONE_MERGED("TombstoneMerged");


    @NonNull
    private final String value;

    a(String str) {
        this.value = str;
    }

    @NonNull
    public String getValue() {
        return this.value;
    }
}
