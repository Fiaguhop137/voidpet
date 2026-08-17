package androidx.media3.exoplayer.hls;

import U1.AbstractC1459a;
import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f24601a;

    class a extends LinkedHashMap {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f24602a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, float f10, boolean z10, int i11) {
            super(i10, f10, z10);
            this.f24602a = i11;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry entry) {
            return size() > this.f24602a;
        }
    }

    public b(int i10) {
        this.f24601a = new a(i10 + 1, 1.0f, false, i10);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return (byte[]) this.f24601a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return (byte[]) this.f24601a.put((Uri) AbstractC1459a.e(uri), (byte[]) AbstractC1459a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return (byte[]) this.f24601a.remove(AbstractC1459a.e(uri));
    }
}
