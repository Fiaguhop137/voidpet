package kotlin.reflect;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public interface j extends b {

    public enum a {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f48397e = Gd.a.a(e());
    }

    boolean b();

    int getIndex();

    String getName();

    o getType();

    a j();

    boolean u();
}
