package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1965v extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private K f23656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23657b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a extends C1965v {
        public a(String str) {
            super(str);
        }
    }

    public C1965v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f23656a = null;
    }

    public C1965v(String str) {
        super(str);
        this.f23656a = null;
    }

    static C1965v b() {
        return new C1965v("Protocol message end-group tag did not match expected tag.");
    }

    static C1965v c() {
        return new C1965v("Protocol message contained an invalid tag (zero).");
    }

    static C1965v d() {
        return new C1965v("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C1965v f() {
        return new C1965v("CodedInputStream encountered a malformed varint.");
    }

    static C1965v g() {
        return new C1965v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1965v h() {
        return new C1965v("Failed to parse the message.");
    }

    static C1965v i() {
        return new C1965v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static C1965v l() {
        return new C1965v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C1965v m() {
        return new C1965v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f23657b;
    }

    void j() {
        this.f23657b = true;
    }

    public C1965v k(K k10) {
        this.f23656a = k10;
        return this;
    }
}
