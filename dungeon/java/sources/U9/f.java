package U9;

import K9.C1135c;
import K9.D;
import K9.InterfaceC1136d;
import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class f implements i, j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W9.b f13402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f13403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final W9.b f13404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f13405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f13406e;

    f(W9.b bVar, Set set, Executor executor, W9.b bVar2, Context context) {
        this.f13402a = bVar;
        this.f13405d = set;
        this.f13406e = executor;
        this.f13404c = bVar2;
        this.f13403b = context;
    }

    private f(Context context, String str, Set set, W9.b bVar, Executor executor) {
        this(new K9.w(new c(context, str)), set, executor, bVar, context);
    }

    public static /* synthetic */ String c(f fVar) {
        String string;
        synchronized (fVar) {
            try {
                v vVar = (v) fVar.f13402a.get();
                List listG = vVar.g();
                vVar.f();
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < listG.size(); i10++) {
                    w wVar = (w) listG.get(i10);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", wVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) wVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        string = byteArrayOutputStream.toString("UTF-8");
                    } catch (Throwable th) {
                        try {
                            gZIPOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        return string;
    }

    public static /* synthetic */ v d(Context context, String str) {
        return new v(context, str);
    }

    public static /* synthetic */ f e(D d10, InterfaceC1136d interfaceC1136d) {
        return new f((Context) interfaceC1136d.a(Context.class), ((H9.e) interfaceC1136d.a(H9.e.class)).r(), interfaceC1136d.f(g.class), interfaceC1136d.g(p083ea.i.class), (Executor) interfaceC1136d.e(d10));
    }

    public static /* synthetic */ Void f(f fVar) {
        synchronized (fVar) {
            ((v) fVar.f13402a.get()).o(System.currentTimeMillis(), ((p083ea.i) fVar.f13404c.get()).a());
        }
        return null;
    }

    public static C1135c g() {
        D dA = D.a(J9.a.class, Executor.class);
        return C1135c.f(f.class, i.class, j.class).b(K9.q.k(Context.class)).b(K9.q.k(H9.e.class)).b(K9.q.m(g.class)).b(K9.q.l(p083ea.i.class)).b(K9.q.j(dA)).f(new b(dA)).d();
    }

    @Override // U9.i
    public Task a() {
        return !p128h1.o.a(this.f13403b) ? Tasks.forResult("") : Tasks.call(this.f13406e, new d(this));
    }

    @Override // U9.j
    public synchronized j.a b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        v vVar = (v) this.f13402a.get();
        if (!vVar.m(jCurrentTimeMillis)) {
            return j.a.NONE;
        }
        vVar.k();
        return j.a.GLOBAL;
    }

    public Task h() {
        if (this.f13405d.size() > 0 && p128h1.o.a(this.f13403b)) {
            return Tasks.call(this.f13406e, new e(this));
        }
        return Tasks.forResult(null);
    }
}
