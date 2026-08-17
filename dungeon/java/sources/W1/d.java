package W1;

import U1.S;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f14463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f14464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AssetFileDescriptor f14465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FileInputStream f14466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f14467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f14468j;

    public static class a extends g {
        public a(IOException iOException, int i10) {
            super(iOException, i10);
        }
    }

    public d(Context context) {
        super(false);
        this.f14463e = context.getContentResolver();
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // W1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f14464f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f14466h     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.f14466h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f14465g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.f14465g = r0
            boolean r0 = r5.f14468j
            if (r0 == 0) goto L2b
            r5.f14468j = r2
            r5.q()
        L2b:
            return
        L2c:
            W1.d$a r4 = new W1.d$a     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.f14465g = r0
            boolean r0 = r5.f14468j
            if (r0 == 0) goto L3d
            r5.f14468j = r2
            r5.q()
        L3d:
            throw r1
        L3e:
            W1.d$a r4 = new W1.d$a     // Catch: java.lang.Throwable -> Le
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.f14466h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f14465g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.f14465g = r0
            boolean r0 = r5.f14468j
            if (r0 == 0) goto L5d
            r5.f14468j = r2
            r5.q()
        L5d:
            throw r3
        L5e:
            W1.d$a r4 = new W1.d$a     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.f14465g = r0
            boolean r0 = r5.f14468j
            if (r0 == 0) goto L6f
            r5.f14468j = r2
            r5.q()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.d.close():void");
    }

    @Override // W1.f
    public Uri e() {
        return this.f14464f;
    }

    @Override // W1.f
    public long m(j jVar) throws a {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = jVar.f14480a.normalizeScheme();
            this.f14464f = uriNormalizeScheme;
            r(jVar);
            if (Objects.equals(uriNormalizeScheme.getScheme(), "content")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = this.f14463e.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.f14463e.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f14465g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new a(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f14466h = fileInputStream;
            if (length != -1 && jVar.f14486g > length) {
                throw new a(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(jVar.f14486g + startOffset) - startOffset;
            if (jSkip != jVar.f14486g) {
                throw new a(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f14467i = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f14467i = jPosition;
                    if (jPosition < 0) {
                        throw new a(null, 2008);
                    }
                }
            } else {
                long j10 = length - jSkip;
                this.f14467i = j10;
                if (j10 < 0) {
                    throw new a(null, 2008);
                }
            }
            long jMin = jVar.f14487h;
            if (jMin != -1) {
                long j11 = this.f14467i;
                if (j11 != -1) {
                    jMin = Math.min(j11, jMin);
                }
                this.f14467i = jMin;
            }
            this.f14468j = true;
            s(jVar);
            long j12 = jVar.f14487h;
            return j12 != -1 ? j12 : this.f14467i;
        } catch (a e10) {
            throw e10;
        } catch (IOException e11) {
            throw new a(e11, e11 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f14467i;
        if (j10 == 0) {
            return -1;
        }
        if (j10 != -1) {
            try {
                i11 = (int) Math.min(j10, i11);
            } catch (IOException e10) {
                throw new a(e10, 2000);
            }
        }
        int i12 = ((FileInputStream) S.i(this.f14466h)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        long j11 = this.f14467i;
        if (j11 != -1) {
            this.f14467i = j11 - ((long) i12);
        }
        p(i12);
        return i12;
    }
}
