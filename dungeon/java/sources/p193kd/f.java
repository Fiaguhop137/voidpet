package p193kd;

import expo.modules.updates.d;
import kotlin.enums.EnumEntries;
import p229md.b;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public enum a {
        IDLE,
        NEW_UPDATE_LOADING,
        NEW_UPDATE_LOADED;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f48060e = Gd.a.a(e());
    }

    void a();

    void b();

    void c(b.a aVar);

    void d(Exception exc);

    int e();

    void f();

    a g();

    d.a h();
}
