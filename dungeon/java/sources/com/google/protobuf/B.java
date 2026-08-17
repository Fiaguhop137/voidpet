package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class B extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f37684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37685b;

    public static class a extends B {
        public a(String str) {
            super(str);
        }
    }

    public B(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f37684a = null;
    }

    public B(String str) {
        super(str);
        this.f37684a = null;
    }

    static B b() {
        return new B("Protocol message end-group tag did not match expected tag.");
    }

    static B c() {
        return new B("Protocol message contained an invalid tag (zero).");
    }

    static B d() {
        return new B("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static B f() {
        return new B("CodedInputStream encountered a malformed varint.");
    }

    static B g() {
        return new B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static B h() {
        return new B("Failed to parse the message.");
    }

    static B i() {
        return new B("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static B l() {
        return new B("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static B m() {
        return new B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f37685b;
    }

    void j() {
        this.f37685b = true;
    }

    public B k(T t10) {
        this.f37684a = t10;
        return this;
    }
}
