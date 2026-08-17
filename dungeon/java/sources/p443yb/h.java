package p443yb;

import Rb.d;
import Z0.c;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.io.FileWalkDirection;
import kotlin.io.j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import kotlin.time.a;
import kotlin.time.b;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends File implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f58010a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Uri uri) {
        super(URI.create(uri.toString()));
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.f58010a = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h u(File it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new h(Uri.fromFile(it));
    }

    @Override // p443yb.k
    public OutputStream X() {
        return new FileOutputStream(this);
    }

    @Override // p443yb.k
    public InputStream Y() {
        return new FileInputStream(this);
    }

    @Override // p443yb.k
    public Uri e() {
        return this.f58010a;
    }

    @Override // p443yb.k
    public Uri g(d appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Uri uriH = c.h(appContext.C().getApplication(), appContext.C().getApplication().getPackageName() + ".FileSystemFileProvider", this);
        Intrinsics.checkNotNullExpressionValue(uriH, "getUriForFile(...)");
        return uriH;
    }

    @Override // p443yb.k
    public Long getCreationTime() throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String path = getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        Path path2 = Paths.get(path, new String[0]);
        Intrinsics.checkNotNullExpressionValue(path2, "get(...)");
        BasicFileAttributes attributes = Files.readAttributes(path2, (Class<BasicFileAttributes>) c.a(), (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
        Intrinsics.checkNotNullExpressionValue(attributes, "readAttributes(...)");
        a.C0570a c0570a = a.f48546b;
        return Long.valueOf(a.x(b.q(attributes.creationTime().toMillis(), p070df.b.MILLISECONDS)));
    }

    @Override // p443yb.k
    public String getFileName() {
        return super.getName();
    }

    @Override // p443yb.k
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // p443yb.k
    public k h(String mimeType, String displayName) throws IOException {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.createNewFile();
        return new h(Uri.fromFile(file));
    }

    @Override // p443yb.k
    public Sequence i() {
        return k.N(j.p(this, FileWalkDirection.TOP_DOWN), new g());
    }

    @Override // p443yb.k
    public k o(String displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.mkdir();
        return new h(Uri.fromFile(file));
    }

    @Override // p443yb.k
    public List p() {
        File[] fileArrListFiles = super.listFiles();
        if (fileArrListFiles == null) {
            return CollectionsKt.l();
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            Intrinsics.c(file);
            arrayList.add(new h(Uri.fromFile(file)));
        }
        return arrayList;
    }

    @Override // p443yb.k
    public boolean r() {
        File[] fileArrListFiles;
        if (isDirectory() && (fileArrListFiles = listFiles()) != null) {
            for (File file : fileArrListFiles) {
                Intrinsics.c(file);
                j.y(file);
            }
        }
        return super.delete();
    }

    @Override // p443yb.k
    public /* bridge */ /* synthetic */ Long s() {
        return Long.valueOf(lastModified());
    }
}
