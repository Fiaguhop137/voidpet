package T6;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f12278e = new d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f12279f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f12280a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f12281b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f12282c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f12283d;

    public static final class a extends i {
        a() {
        }

        @Override // T6.h
        public void a(Object obj, j responder) {
            Intrinsics.checkNotNullParameter(responder, "responder");
            Map map = b.this.f12282c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { mode: string, filename: string }");
                        }
                        String strOptString = jSONObject.optString("mode");
                        if (strOptString == null) {
                            throw new Exception("missing params.mode");
                        }
                        String strOptString2 = jSONObject.optString("filename");
                        if (strOptString2 == null) {
                            throw new Exception("missing params.filename");
                        }
                        if (!Intrinsics.b(strOptString, "r")) {
                            throw new IllegalArgumentException(("unsupported mode: " + strOptString).toString());
                        }
                        responder.a(Integer.valueOf(bVar.d(strOptString2)));
                        Unit unit = Unit.f48228a;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: T6.b$b, reason: collision with other inner class name */
    public static final class C0179b extends i {
        C0179b() {
        }

        @Override // T6.h
        public void a(Object obj, j responder) {
            Intrinsics.checkNotNullParameter(responder, "responder");
            Map map = b.this.f12282c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        if (!(obj instanceof Number)) {
                            throw new Exception("params must be a file handle");
                        }
                        e eVar = (e) bVar.f12282c.get(obj);
                        if (eVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        K.c(bVar.f12282c).remove(obj);
                        eVar.a();
                        responder.a("");
                        Unit unit = Unit.f48228a;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class c extends i {
        c() {
        }

        @Override // T6.h
        public void a(Object obj, j responder) {
            Intrinsics.checkNotNullParameter(responder, "responder");
            Map map = b.this.f12282c;
            b bVar = b.this;
            synchronized (map) {
                try {
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            throw new Exception("params must be an object { file: handle, size: number }");
                        }
                        int iOptInt = jSONObject.optInt("file");
                        if (iOptInt == 0) {
                            throw new Exception("invalid or missing file handle");
                        }
                        int iOptInt2 = jSONObject.optInt("size");
                        if (iOptInt2 == 0) {
                            throw new Exception("invalid or missing read size");
                        }
                        e eVar = (e) bVar.f12282c.get(Integer.valueOf(iOptInt));
                        if (eVar == null) {
                            throw new Exception("invalid file handle, it might have timed out");
                        }
                        responder.a(eVar.d(iOptInt2));
                        Unit unit = Unit.f48228a;
                    } catch (Exception e10) {
                        responder.b(e10.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileInputStream f12287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f12288b = System.currentTimeMillis() + 30000;

        public e(String str) {
            this.f12287a = new FileInputStream(str);
        }

        private final void c() {
            this.f12288b = System.currentTimeMillis() + 30000;
        }

        public final void a() throws IOException {
            this.f12287a.close();
        }

        public final boolean b() {
            return System.currentTimeMillis() >= this.f12288b;
        }

        public final String d(int i10) {
            c();
            byte[] bArr = new byte[i10];
            String strEncodeToString = Base64.encodeToString(bArr, 0, this.f12287a.read(bArr), 0);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }
    }

    static {
        String simpleName = T6.c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f12279f = simpleName;
    }

    public b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f12283d = linkedHashMap;
        linkedHashMap.put("fopen", new a());
        linkedHashMap.put("fclose", new C0179b());
        linkedHashMap.put("fread", new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int d(String str) {
        int i10 = this.f12280a;
        this.f12280a = i10 + 1;
        this.f12282c.put(Integer.valueOf(i10), new e(str));
        if (this.f12282c.size() == 1) {
            this.f12281b.postDelayed(this, 30000L);
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        e eVar = (e) entry.getValue();
        if (!eVar.b()) {
            return false;
        }
        try {
            eVar.a();
            return true;
        } catch (IOException e10) {
            W4.a.n(f12279f, "Failed to close expired file", e10);
            return true;
        }
    }

    public final Map e() {
        return this.f12283d;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f12282c) {
            try {
                CollectionsKt.H(this.f12282c.entrySet(), new T6.a());
                if (!this.f12282c.isEmpty()) {
                    this.f12281b.postDelayed(this, 30000L);
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
