package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p436y4.y;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0362a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f28638a;

        C0362a(InputStream inputStream) {
            this.f28638a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f28638a);
            } finally {
                this.f28638a.reset();
            }
        }
    }

    class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f28639a;

        b(ByteBuffer byteBuffer) {
            this.f28639a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.c(this.f28639a);
            } finally {
                L4.a.d(this.f28639a);
            }
        }
    }

    class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f28640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p328s4.b f28641b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p328s4.b bVar) {
            this.f28640a = parcelFileDescriptorRewinder;
            this.f28641b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            y yVar = null;
            try {
                y yVar2 = new y(new FileInputStream(this.f28640a.a().getFileDescriptor()), this.f28641b);
                try {
                    ImageHeaderParser.ImageType imageTypeD = imageHeaderParser.d(yVar2);
                    yVar2.c();
                    this.f28640a.a();
                    return imageTypeD;
                } catch (Throwable th) {
                    th = th;
                    yVar = yVar2;
                    if (yVar != null) {
                        yVar.c();
                    }
                    this.f28640a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f28642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p328s4.b f28643b;

        d(ByteBuffer byteBuffer, p328s4.b bVar) {
            this.f28642a = byteBuffer;
            this.f28643b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f28642a, this.f28643b);
            } finally {
                L4.a.d(this.f28642a);
            }
        }
    }

    class e implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f28644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p328s4.b f28645b;

        e(InputStream inputStream, p328s4.b bVar) {
            this.f28644a = inputStream;
            this.f28645b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f28644a, this.f28645b);
            } finally {
                this.f28644a.reset();
            }
        }
    }

    class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f28646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p328s4.b f28647b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p328s4.b bVar) {
            this.f28646a = parcelFileDescriptorRewinder;
            this.f28647b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            y yVar = null;
            try {
                y yVar2 = new y(new FileInputStream(this.f28646a.a().getFileDescriptor()), this.f28647b);
                try {
                    int iB = imageHeaderParser.b(yVar2, this.f28647b);
                    yVar2.c();
                    this.f28646a.a();
                    return iB;
                } catch (Throwable th) {
                    th = th;
                    yVar = yVar2;
                    if (yVar != null) {
                        yVar.c();
                    }
                    this.f28646a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p328s4.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, p328s4.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, p328s4.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = gVar.a((ImageHeaderParser) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, p328s4.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, p328s4.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new y(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0362a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a((ImageHeaderParser) list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
