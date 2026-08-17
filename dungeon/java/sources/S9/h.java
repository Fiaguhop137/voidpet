package S9;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f11587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final P9.d f11589c;

    public static final class a implements Q9.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final P9.d f11590d = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f11591a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f11592b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private P9.d f11593c = f11590d;

        public static /* synthetic */ void b(Object obj, P9.e eVar) {
            throw new P9.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f11591a), new HashMap(this.f11592b), this.f11593c);
        }

        public a d(Q9.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // Q9.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, P9.d dVar) {
            this.f11591a.put(cls, dVar);
            this.f11592b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, P9.d dVar) {
        this.f11587a = map;
        this.f11588b = map2;
        this.f11589c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f11587a, this.f11588b, this.f11589c).q(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
