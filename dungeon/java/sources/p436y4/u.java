package p436y4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface u {

    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f57935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f57936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final p328s4.b f57937c;

        a(ByteBuffer byteBuffer, List list, p328s4.b bVar) {
            this.f57935a = byteBuffer;
            this.f57936b = list;
            this.f57937c = bVar;
        }

        private InputStream e() {
            return L4.a.g(L4.a.d(this.f57935a));
        }

        @Override // p436y4.u
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // p436y4.u
        public void b() {
        }

        @Override // p436y4.u
        public int c() {
            return com.bumptech.glide.load.a.c(this.f57936b, L4.a.d(this.f57935a), this.f57937c);
        }

        @Override // p436y4.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.g(this.f57936b, L4.a.d(this.f57935a));
        }
    }

    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final k f57938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p328s4.b f57939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f57940c;

        b(InputStream inputStream, List list, p328s4.b bVar) {
            this.f57939b = (p328s4.b) L4.k.d(bVar);
            this.f57940c = (List) L4.k.d(list);
            this.f57938a = new k(inputStream, bVar);
        }

        @Override // p436y4.u
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f57938a.a(), null, options);
        }

        @Override // p436y4.u
        public void b() {
            this.f57938a.c();
        }

        @Override // p436y4.u
        public int c() {
            return com.bumptech.glide.load.a.b(this.f57940c, this.f57938a.a(), this.f57939b);
        }

        @Override // p436y4.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.f(this.f57940c, this.f57938a.a(), this.f57939b);
        }
    }

    public static final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p328s4.b f57941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f57942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f57943c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, p328s4.b bVar) {
            this.f57941a = (p328s4.b) L4.k.d(bVar);
            this.f57942b = (List) L4.k.d(list);
            this.f57943c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p436y4.u
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f57943c.a().getFileDescriptor(), null, options);
        }

        @Override // p436y4.u
        public void b() {
        }

        @Override // p436y4.u
        public int c() {
            return com.bumptech.glide.load.a.a(this.f57942b, this.f57943c, this.f57941a);
        }

        @Override // p436y4.u
        public ImageHeaderParser.ImageType d() {
            return com.bumptech.glide.load.a.e(this.f57942b, this.f57943c, this.f57941a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    void b();

    int c();

    ImageHeaderParser.ImageType d();
}
