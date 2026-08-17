package A1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: loaded from: classes.dex */
class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Uri f130c;

    c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f129b = context;
        this.f130c = uri;
    }

    @Override // A1.a
    public boolean a() {
        return b.a(this.f129b, this.f130c);
    }

    @Override // A1.a
    public boolean b() {
        return b.b(this.f129b, this.f130c);
    }

    @Override // A1.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // A1.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // A1.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f129b.getContentResolver(), this.f130c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // A1.a
    public boolean f() {
        return b.d(this.f129b, this.f130c);
    }

    @Override // A1.a
    public String i() {
        return b.e(this.f129b, this.f130c);
    }

    @Override // A1.a
    public String j() {
        return b.g(this.f129b, this.f130c);
    }

    @Override // A1.a
    public Uri k() {
        return this.f130c;
    }

    @Override // A1.a
    public boolean l() {
        return b.h(this.f129b, this.f130c);
    }

    @Override // A1.a
    public boolean m() {
        return b.i(this.f129b, this.f130c);
    }

    @Override // A1.a
    public long n() {
        return b.j(this.f129b, this.f130c);
    }

    @Override // A1.a
    public long o() {
        return b.k(this.f129b, this.f130c);
    }

    @Override // A1.a
    public a[] p() {
        throw new UnsupportedOperationException();
    }
}
