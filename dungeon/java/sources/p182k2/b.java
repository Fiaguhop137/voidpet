package p182k2;

import android.net.Uri;
import java.io.InputStream;
import java.util.List;
import p308r2.o;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o.a f47807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f47808b;

    public b(o.a aVar, List list) {
        this.f47807a = aVar;
        this.f47808b = list;
    }

    @Override // r2.o.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a a(Uri uri, InputStream inputStream) {
        a aVar = (a) this.f47807a.a(uri, inputStream);
        List list = this.f47808b;
        return (list == null || list.isEmpty()) ? aVar : (a) aVar.a(this.f47808b);
    }
}
