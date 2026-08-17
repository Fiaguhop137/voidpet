package p121gc;

import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f42313a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(b bVar, Class cls) {
        bVar.d(cls);
        return Unit.f48228a;
    }

    private final void d(Class cls) {
        this.f42313a.remove(cls);
    }

    public final void b(Class cls, JavaScriptObject js) {
        Intrinsics.checkNotNullParameter(cls, "native");
        Intrinsics.checkNotNullParameter(js, "js");
        js.c(new a(this, cls));
        this.f42313a.put(cls, js);
    }

    public final JavaScriptObject e(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "native");
        return (JavaScriptObject) this.f42313a.get(cls);
    }
}
