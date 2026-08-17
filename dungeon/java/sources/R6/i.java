package R6;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f10890c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharsetDecoder f10891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f10892b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(charsetDecoderNewDecoder, "newDecoder(...)");
        this.f10891a = charsetDecoderNewDecoder;
    }

    public final String a(byte[] data, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArr = this.f10892b;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length + i10];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(data, 0, bArr2, bArr.length, i10);
            i10 += bArr.length;
            data = bArr2;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(data, 0, i10);
        byte[] bArr3 = null;
        boolean z10 = false;
        int i11 = 0;
        CharBuffer charBufferDecode = null;
        while (!z10 && i11 < 4) {
            try {
                charBufferDecode = this.f10891a.decode(byteBufferWrap);
                z10 = true;
            } catch (CharacterCodingException unused) {
                i11++;
                byteBufferWrap = ByteBuffer.wrap(data, 0, i10 - i11);
            }
        }
        if (z10 && i11 > 0) {
            bArr3 = new byte[i11];
            System.arraycopy(data, i10 - i11, bArr3, 0, i11);
        }
        this.f10892b = bArr3;
        if (!z10) {
            W4.a.I("ReactNative", "failed to decode string from byte array");
            return "";
        }
        if (charBufferDecode == null) {
            return "";
        }
        char[] cArrArray = charBufferDecode.array();
        Intrinsics.checkNotNullExpressionValue(cArrArray, "array(...)");
        return new String(cArrArray, 0, charBufferDecode.length());
    }
}
