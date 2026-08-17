package Q3;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    public enum a {
        Verbose,
        Debug,
        Info,
        Warn,
        Error;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f9365g = Gd.a.a(e());
    }

    a a();

    void b(String str, a aVar, String str2, Throwable th);
}
