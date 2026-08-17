package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1rSDK extends FilterInputStream {
    private static final short getMonetizationNetwork = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFAdRevenueData;
    private int AFInAppEventType;
    private int areAllFieldsValid;
    private int component1;
    private int component2;
    private int component3;
    private int component4;
    private int copy;
    private final int copydefault;
    private final int equals;
    private int getCurrencyIso4217Code;
    private byte[] getMediationNetwork;
    private byte[] getRevenue;
    private int hashCode;
    private int toString;

    public AFk1rSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) throws IOException {
        this(inputStream, iArr, i10, bArr, i11, i12, (byte) 0);
    }

    private AFk1rSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12, byte b10) throws IOException {
        super(new BufferedInputStream(inputStream, 4096));
        this.component3 = Integer.MAX_VALUE;
        this.AFInAppEventType = 1;
        this.getMediationNetwork = new byte[8];
        this.AFAdRevenueData = new byte[8];
        this.getRevenue = new byte[8];
        this.getCurrencyIso4217Code = 8;
        this.component4 = 8;
        this.component2 = Math.min(Math.max(i11, 5), 16);
        this.component1 = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.AFAdRevenueData, 0, 8);
        }
        long j10 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i10 == 0) {
            this.areAllFieldsValid = (int) j10;
            long j11 = j10 >> 3;
            short s10 = getMonetizationNetwork;
            this.copy = (int) ((((long) s10) * j11) >> 32);
            this.toString = (int) (j10 >> 32);
            this.hashCode = (int) (j11 + ((long) s10));
        } else {
            int i13 = (int) j10;
            this.areAllFieldsValid = i13;
            this.copy = i13 * i10;
            this.toString = i10 ^ i13;
            this.hashCode = (int) (j10 >> 32);
        }
        this.equals = 100;
        this.copydefault = 100;
    }

    private void AFAdRevenueData() {
        if (this.component1 == 3) {
            byte[] bArr = this.getMediationNetwork;
            System.arraycopy(bArr, 0, this.getRevenue, 0, bArr.length);
        }
        byte[] bArr2 = this.getMediationNetwork;
        boolean z10 = true;
        char c10 = 2;
        int i10 = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = 0;
        while (true) {
            int i13 = this.component2;
            if (i12 >= i13) {
                break;
            }
            short s10 = getMonetizationNetwork;
            i11 -= ((((i13 - i12) * s10) + i10) ^ ((i10 << 4) + this.toString)) ^ ((i10 >>> 5) + this.hashCode);
            i10 -= (((i11 << 4) + this.areAllFieldsValid) ^ ((s10 * (i13 - i12)) + i11)) ^ ((i11 >>> 5) + this.copy);
            i12++;
            c10 = c10;
            z10 = z10;
        }
        byte[] bArr3 = this.getMediationNetwork;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[z10 ? 1 : 0] = (byte) (i10 >> 16);
        bArr3[c10] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.component1 == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.getMediationNetwork;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.AFAdRevenueData[i14]);
            }
            byte[] bArr5 = this.getRevenue;
            System.arraycopy(bArr5, 0, this.AFAdRevenueData, 0, bArr5.length);
        }
    }

    private int getMonetizationNetwork() throws IOException {
        if (this.component3 == Integer.MAX_VALUE) {
            this.component3 = ((FilterInputStream) this).in.read();
        }
        if (this.getCurrencyIso4217Code == 8) {
            byte[] bArr = this.getMediationNetwork;
            int i10 = this.component3;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.getMediationNetwork, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.equals;
            if (i13 == this.copydefault) {
                AFAdRevenueData();
            } else {
                if (this.AFInAppEventType <= i13) {
                    AFAdRevenueData();
                }
                int i14 = this.AFInAppEventType;
                if (i14 < this.copydefault) {
                    this.AFInAppEventType = i14 + 1;
                } else {
                    this.AFInAppEventType = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.component3 = i15;
            this.getCurrencyIso4217Code = 0;
            this.component4 = i15 < 0 ? 8 - (this.getMediationNetwork[7] & 255) : 8;
        }
        return this.component4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        getMonetizationNetwork();
        return this.component4 - this.getCurrencyIso4217Code;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        getMonetizationNetwork();
        int i10 = this.getCurrencyIso4217Code;
        if (i10 >= this.component4) {
            return -1;
        }
        byte[] bArr = this.getMediationNetwork;
        this.getCurrencyIso4217Code = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            getMonetizationNetwork();
            int i14 = this.getCurrencyIso4217Code;
            if (i14 >= this.component4) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.getMediationNetwork;
            this.getCurrencyIso4217Code = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }
}
