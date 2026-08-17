package com.applovin.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.applovin.impl.sdk.utils.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f28046b = {-83, -98, -53, -112, -29, -118, 55, 117, 59, 8, -12, -15, 73, 110, -67, 57, 117, 4, -26, 97, 66, -12, 125, 91, -119, -103, -30, 114, 123, 54, 51, -77};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f28047c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f28048a;

    static {
        byte[] bArr = new byte[32];
        f28047c = bArr;
        System.arraycopy(new byte[]{18, 12, 28, 20, 17, 23, 26, 9, 21, 3, 14, 29, 4, 0, 2, 7, 10, 29, 6, 20, 1}, 0, bArr, 0, 21);
    }

    public g2(u0 u0Var) {
        this.f28048a = u0Var;
    }

    public static String a(String str) {
        if (str.length() == 86) {
            return str;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException("SHA-256 algorithm not found", e10);
        }
    }

    public static byte[] a(byte[] bArr, long j10, byte[] bArr2) {
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        long j11 = j10;
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = i10 % 8;
            if (i11 == 0) {
                long j12 = ((long) i10) + j10;
                long j13 = (j12 ^ (j12 >>> 33)) * (-4417276706812531889L);
                long j14 = (j13 ^ (j13 >>> 29)) * (-8796714831421723037L);
                j11 = j14 ^ (j14 >>> 32);
            }
            bArrCopyOf[i10] = (byte) (((long) bArrCopyOf[i10]) ^ (((j11 >> (i11 * 8)) & 255) ^ ((long) bArr2[i10 % bArr2.length])));
        }
        return bArrCopyOf;
    }

    public static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 2), StandardCharsets.UTF_8).replace('+', '-').replace('/', '_').replace('=', '*');
    }

    public static void b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        int length = str.length();
        if (length != 86 && length != 36) {
            throw new IllegalArgumentException("Key is not the correct length");
        }
    }

    public final String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr);
            return StringUtils.toHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            u0 u0Var = this.f28048a;
            if (u0Var != null) {
                u0Var.a(p1.f28288a, "SHA1", e10);
            }
            throw new RuntimeException("SHA-1 algorithm not found", e10);
        }
    }

    public final byte[] a(String str, long j10, String str2) {
        char c10 = ' ';
        try {
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            byte[] bArrA = a(strSubstring2, f28046b);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(((byte) (j10 & 255)) ^ bArrA[0]);
            char c11 = '\b';
            byteArrayOutputStream.write(((byte) ((j10 >> 8) & 255)) ^ bArrA[1]);
            char c12 = 16;
            byteArrayOutputStream.write(((byte) ((j10 >> 16) & 255)) ^ bArrA[2]);
            byteArrayOutputStream.write(((byte) ((j10 >> 24) & 255)) ^ bArrA[3]);
            byteArrayOutputStream.write(((byte) ((j10 >> 32) & 255)) ^ bArrA[4]);
            byteArrayOutputStream.write(((byte) ((j10 >> 40) & 255)) ^ bArrA[5]);
            byteArrayOutputStream.write(((byte) ((j10 >> 48) & 255)) ^ bArrA[6]);
            byteArrayOutputStream.write(((byte) ((j10 >> 56) & 255)) ^ bArrA[7]);
            int i10 = 0;
            while (i10 < bytes.length) {
                char c13 = c11;
                char c14 = c12;
                long j11 = j10 + ((long) i10);
                long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                long j14 = j13 ^ (j13 >> c10);
                char c15 = c10;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i10 % bArrA.length] ^ (i10 >= bytes.length ? (byte) 0 : bytes[i10]))) ^ (j14 & 255)));
                int i11 = i10 + 1;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i11 % bArrA.length] ^ (i11 >= bytes.length ? (byte) 0 : bytes[i11]))) ^ ((j14 >> c13) & 255)));
                int i12 = i10 + 2;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i12 % bArrA.length] ^ (i12 >= bytes.length ? (byte) 0 : bytes[i12]))) ^ ((j14 >> c14) & 255)));
                int i13 = i10 + 3;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i13 % bArrA.length] ^ (i13 >= bytes.length ? (byte) 0 : bytes[i13]))) ^ ((j14 >> 24) & 255)));
                int i14 = i10 + 4;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i14 % bArrA.length] ^ (i14 >= bytes.length ? (byte) 0 : bytes[i14]))) ^ ((j14 >> c15) & 255)));
                int i15 = i10 + 5;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i15 % bArrA.length] ^ (i15 >= bytes.length ? (byte) 0 : bytes[i15]))) ^ ((j14 >> 40) & 255)));
                int i16 = i10 + 6;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i16 % bArrA.length] ^ (i16 >= bytes.length ? (byte) 0 : bytes[i16]))) ^ ((j14 >> 48) & 255)));
                int i17 = i10 + 7;
                byteArrayOutputStream.write((byte) (((long) (bArrA[i17 % bArrA.length] ^ (i17 >= bytes.length ? (byte) 0 : bytes[i17]))) ^ ((j14 >> 56) & 255)));
                i10 += 8;
                c11 = c13;
                c12 = c14;
                c10 = c15;
            }
            String strB = b(byteArrayOutputStream.toByteArray());
            return ("1:" + a(f28046b) + ":" + strSubstring + ":" + strB).getBytes(StandardCharsets.UTF_8);
        } catch (UnsupportedEncodingException e10) {
            u0 u0Var = this.f28048a;
            if (u0Var == null) {
                return null;
            }
            u0Var.a(p1.f28288a, "encode", e10);
            return null;
        }
    }

    public final byte[] a(String str, long j10, boolean z10, String str2) {
        byte[] byteArray;
        ByteBuffer byteBufferAllocate;
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            String strSubstring = str2.substring(32);
            String strSubstring2 = str2.substring(0, 32);
            byte[] bArr = f28047c;
            byte[] bArrA = a(strSubstring2, bArr);
            long jA = i1.a(bArrA, 0) ^ j10;
            byte[] bytes2 = ("2:" + a(bArr) + ":" + strSubstring + ":").getBytes();
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(16);
            byteBufferAllocate2.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate2.putLong((long) length);
            byteBufferAllocate2.putLong(jA);
            byteBufferAllocate2.flip();
            if (bytes.length == 0) {
                byteArray = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bytes.length);
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bytes);
                gZIPOutputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
            }
            byte[] bArrA2 = a(byteArray, j10, bArrA);
            if (z10) {
                byte[] bytes3 = b(byteBufferAllocate2.array()).getBytes();
                byte[] bytes4 = b(bArrA2).getBytes();
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + bytes3.length + bytes4.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(bytes3);
                byteBufferAllocate.put(bytes4);
            } else {
                byteBufferAllocate = ByteBuffer.allocate(bytes2.length + byteBufferAllocate2.remaining() + bArrA2.length);
                byteBufferAllocate.put(bytes2);
                byteBufferAllocate.put(byteBufferAllocate2);
                byteBufferAllocate.put(bArrA2);
            }
            byteBufferAllocate.flip();
            return byteBufferAllocate.array();
        } catch (UnsupportedEncodingException e10) {
            u0 u0Var = this.f28048a;
            if (u0Var != null) {
                u0Var.a(p1.f28288a, "encode2", e10);
            }
            throw new RuntimeException("UTF-8 encoding not found", e10);
        } catch (IOException e11) {
            u0 u0Var2 = this.f28048a;
            if (u0Var2 != null) {
                u0Var2.a(p1.f28288a, "encode2", e11);
            }
            return null;
        }
    }

    public final byte[] a(String str, byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            u0 u0Var = this.f28048a;
            if (u0Var != null) {
                u0Var.a(p1.f28288a, "SHA256", e10);
            }
            throw new RuntimeException("SHA-256 algorithm not found", e10);
        }
    }

    public final String b(String str, byte[] bArr) {
        f2 f2Var;
        String str2;
        b(str);
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        if (bArr.length == 0) {
            f2Var = f2.NONE;
        } else {
            char c10 = (char) bArr[0];
            if (c10 == '2') {
                f2Var = f2.V2;
            } else {
                f2Var = c10 == '{' ? f2.NONE : f2.DEFAULT;
            }
        }
        if (f2.NONE == f2Var) {
            return new String(bArr);
        }
        char c11 = '\b';
        if (f2Var == f2.V2) {
            String strA = a(str);
            try {
                int iC = c(strA, bArr);
                if (iC != 0) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, iC, bArr.length);
                    if (bArrCopyOfRange.length >= 16) {
                        long jA = i1.a(bArrCopyOfRange, 8);
                        byte[] bArrA = a(strA.substring(0, 32), f28047c);
                        return new String(z.a(a(Arrays.copyOfRange(bArrCopyOfRange, 16, bArrCopyOfRange.length), i1.a(bArrA, 0) ^ jA, bArrA)), StandardCharsets.UTF_8);
                    }
                }
            } catch (UnsupportedEncodingException e10) {
                u0 u0Var = this.f28048a;
                if (u0Var != null) {
                    u0Var.a(p1.f28288a, "decode2", e10);
                }
                throw new RuntimeException("UTF-8 encoding not found", e10);
            } catch (IOException e11) {
                p1.b(p1.f28288a, "Failed to ungzip decode", e11);
                u0 u0Var2 = this.f28048a;
                if (u0Var2 != null) {
                    u0Var2.a(p1.f28288a, "decode2", e11);
                }
            }
            return null;
        }
        String[] strArrSplit = new String(bArr).split(":");
        try {
            try {
                if (!"1".equals(strArrSplit[0]) || strArrSplit.length != 4) {
                    return null;
                }
                String str3 = strArrSplit[1];
                char c12 = 2;
                String str4 = strArrSplit[2];
                str2 = null;
                try {
                    byte[] bArrDecode = Base64.decode(strArrSplit[3].replace('-', '+').replace('_', '/').replace('*', '='), 0);
                    if (!str.endsWith(str4)) {
                        return null;
                    }
                    byte[] bArr2 = f28046b;
                    if (!a(bArr2).equals(str3)) {
                        return null;
                    }
                    byte[] bArrA2 = a(str.substring(0, 32), bArr2);
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
                    char c13 = 16;
                    char c14 = 7;
                    char c15 = '8';
                    long j10 = ((long) ((byteArrayInputStream.read() ^ bArrA2[0]) & 255)) | (((long) ((byteArrayInputStream.read() ^ bArrA2[1]) & 255)) << 8) | (((long) ((byteArrayInputStream.read() ^ bArrA2[2]) & 255)) << 16) | (((long) ((byteArrayInputStream.read() ^ bArrA2[3]) & 255)) << 24) | (((long) ((byteArrayInputStream.read() ^ bArrA2[4]) & 255)) << 32) | (((long) ((byteArrayInputStream.read() ^ bArrA2[5]) & 255)) << 40) | (((long) ((byteArrayInputStream.read() ^ bArrA2[6]) & 255)) << 48) | (((long) ((byteArrayInputStream.read() ^ bArrA2[7]) & 255)) << 56);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr3 = new byte[8];
                    int i10 = byteArrayInputStream.read(bArr3);
                    int i11 = 0;
                    while (i10 >= 0) {
                        char c16 = c15;
                        char c17 = c14;
                        long j11 = ((long) i11) + j10;
                        long j12 = (j11 ^ (j11 >> 33)) * (-4417276706812531889L);
                        long j13 = (j12 ^ (j12 >> 29)) * (-8796714831421723037L);
                        long j14 = j13 ^ (j13 >> 32);
                        char c18 = c11;
                        char c19 = c12;
                        char c20 = c13;
                        byteArrayOutputStream.write((byte) (((long) (bArr3[0] ^ bArrA2[i11 % bArrA2.length])) ^ (j14 & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr3[1] ^ bArrA2[(i11 + 1) % bArrA2.length])) ^ ((j14 >> c18) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr3[c19] ^ bArrA2[(i11 + 2) % bArrA2.length])) ^ ((j14 >> c20) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr3[3] ^ bArrA2[(i11 + 3) % bArrA2.length])) ^ ((j14 >> 24) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr3[4] ^ bArrA2[(i11 + 4) % bArrA2.length])) ^ ((j14 >> 32) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr3[5] ^ bArrA2[(i11 + 5) % bArrA2.length])) ^ ((j14 >> 40) & 255)));
                        byteArrayOutputStream.write((byte) (((long) (bArr3[6] ^ bArrA2[(i11 + 6) % bArrA2.length])) ^ ((j14 >> 48) & 255)));
                        byteArrayOutputStream.write((byte) (((j14 >> c16) & 255) ^ ((long) (bArr3[c17] ^ bArrA2[(i11 + 7) % bArrA2.length]))));
                        i11 += 8;
                        c14 = c17;
                        c12 = c19;
                        c11 = c18;
                        c13 = c20;
                        i10 = byteArrayInputStream.read(bArr3);
                        c15 = c16;
                    }
                    return new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8).trim();
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (IOException e13) {
                e = e13;
                str2 = null;
            }
        } catch (UnsupportedEncodingException e14) {
            u0 u0Var3 = this.f28048a;
            if (u0Var3 != null) {
                u0Var3.a(p1.f28288a, "decode", e14);
            }
            throw new RuntimeException("UTF-8 encoding not found", e14);
        }
        p1.b(p1.f28288a, "Failed to read bytes", e);
        u0 u0Var4 = this.f28048a;
        if (u0Var4 == null) {
            return str2;
        }
        u0Var4.a(p1.f28288a, "decode", e);
        return str2;
    }

    public final int c(String str, byte[] bArr) {
        int i10;
        if (bArr != null && bArr.length != 0 && !TextUtils.isEmpty(str)) {
            if (bArr.length != 0) {
                i10 = 0;
                while (true) {
                    if (i10 >= bArr.length) {
                        i10 = -1;
                        break;
                    }
                    if (bArr[i10] == 58) {
                        break;
                    }
                    i10++;
                }
            } else {
                i10 = -1;
                break;
            }
            if (i10 < 0) {
                return 0;
            }
            byte[] bytes = a(f28047c).getBytes();
            int i11 = i10 + 1;
            int length = bytes.length + i11;
            if (bArr.length > length && bArr[length] == 58) {
                int length2 = str.length();
                int i12 = length + (length2 == 86 ? length2 - 32 : 64);
                int i13 = i12 + 1;
                if (bArr.length <= i13 || bArr[i13] != 58 || !Arrays.equals(Arrays.copyOfRange(bArr, i11, bytes.length + i11), bytes)) {
                    return 0;
                }
                int i14 = i12 + 2;
                if (i12 + 10 > bArr.length) {
                    return 0;
                }
                return i14;
            }
        }
        return 0;
    }
}
