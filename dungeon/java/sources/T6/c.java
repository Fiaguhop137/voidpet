package T6;

import If.C1109k;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements g.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f12289c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f12290d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f12291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f12292b;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final class b implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f12293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f12294b;

        public b(c cVar, Object id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f12294b = cVar;
            this.f12293a = id2;
        }

        @Override // T6.j
        public void a(Object result) {
            Intrinsics.checkNotNullParameter(result, "result");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f12293a);
                jSONObject.put("result", result);
                g gVar = this.f12294b.f12292b;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                gVar.o(string);
            } catch (Exception e10) {
                W4.a.n(c.f12290d, "Responding failed", e10);
            }
        }

        @Override // T6.j
        public void b(Object error) {
            Intrinsics.checkNotNullParameter(error, "error");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.f12293a);
                jSONObject.put("error", error);
                g gVar = this.f12294b.f12292b;
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                gVar.o(string);
            } catch (Exception e10) {
                W4.a.n(c.f12290d, "Responding with error failed", e10);
            }
        }
    }

    static {
        String simpleName = c.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f12290d = simpleName;
    }

    public c(String clientId, e settings, Map requestHandlers, g.b bVar) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(requestHandlers, "requestHandlers");
        this.f12291a = requestHandlers;
        String string = new Uri.Builder().scheme("ws").encodedAuthority(settings.b()).appendPath("message").appendQueryParameter("device", com.facebook.react.modules.systeminfo.a.e()).appendQueryParameter("app", settings.c()).appendQueryParameter("clientid", clientId).build().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f12292b = new g(string, this, bVar);
    }

    private final void b(Object obj, String str) {
        if (obj != null) {
            new b(this, obj).b(str);
        }
        W4.a.m(f12290d, "Handling the message failed with reason: " + str);
    }

    @Override // T6.g.c
    public void a(C1109k bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        W4.a.I(f12290d, "Websocket received message with payload of unexpected type binary");
    }

    public final void e() {
        this.f12292b.i();
    }

    public final void f() {
        this.f12292b.k();
    }

    @Override // T6.g.c
    public void onMessage(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        try {
            JSONObject jSONObject = new JSONObject(text);
            int iOptInt = jSONObject.optInt("version");
            String strOptString = jSONObject.optString("method");
            Object objOpt = jSONObject.opt("id");
            Object objOpt2 = jSONObject.opt("params");
            if (iOptInt != 2) {
                W4.a.m(f12290d, "Message with incompatible or missing version of protocol received: " + iOptInt);
                return;
            }
            if (strOptString == null) {
                b(objOpt, "No method provided");
                return;
            }
            h hVar = (h) this.f12291a.get(strOptString);
            if (hVar == null) {
                b(objOpt, "No request handler for method: " + strOptString);
                return;
            }
            if (objOpt == null) {
                hVar.b(objOpt2);
            } else {
                hVar.a(objOpt2, new b(this, objOpt));
            }
        } catch (Exception e10) {
            W4.a.n(f12290d, "Handling the message failed", e10);
        }
    }
}
