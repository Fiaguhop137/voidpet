package Nf;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f8229a = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f8230b = StandardCharsets.US_ASCII;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f8231c = StandardCharsets.UTF_16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f8232d = StandardCharsets.UTF_16BE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f8233e = StandardCharsets.UTF_16LE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f8234f = StandardCharsets.UTF_8;

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
