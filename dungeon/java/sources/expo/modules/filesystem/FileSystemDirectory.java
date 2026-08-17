package expo.modules.filesystem;

import Ad.v;
import Nb.c;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p407wb.g;
import p407wb.h;
import p407wb.l;
import p407wb.o;
import p407wb.s;
import p443yb.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lexpo/modules/filesystem/FileSystemDirectory;", "Lexpo/modules/filesystem/FileSystemPath;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "B0", "()V", "Z", "Lexpo/modules/filesystem/DirectoryInfo;", "v0", "()Lexpo/modules/filesystem/DirectoryInfo;", "Lexpo/modules/filesystem/CreateOptions;", "options", "q0", "(Lexpo/modules/filesystem/CreateOptions;)V", "", "mimeType", "fileName", "Lexpo/modules/filesystem/FileSystemFile;", "s0", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/FileSystemFile;", "r0", "(Ljava/lang/String;)Lexpo/modules/filesystem/FileSystemDirectory;", "", "", "", "y0", "()Ljava/util/List;", "m0", "()Ljava/lang/String;", "", "z0", "(Lexpo/modules/filesystem/CreateOptions;)Z", "t0", "()Z", "exists", "", "u0", "()J", "size", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemDirectory extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemDirectory(Uri uri) {
        super(uri);
        Intrinsics.checkNotNullParameter(uri, "uri");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e0(k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long h0(k it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length();
    }

    public final void B0() {
    }

    @Override // expo.modules.filesystem.FileSystemPath
    public void Z() throws o {
        if (F().exists() && !F().isDirectory()) {
            throw new o();
        }
    }

    public final String m0() {
        String string = F().e().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (StringsKt.y(string, "/", false, 2, null)) {
            return string;
        }
        return string + "/";
    }

    public final void q0(CreateOptions options) throws s, o {
        Intrinsics.checkNotNullParameter(options, "options");
        Z();
        V(c.WRITE);
        if (z0(options)) {
            if (l.b(getUri())) {
                throw new s("create function does not work with SAF Uris, use `createDirectory` and `createFile` instead");
            }
            U(options);
            if (options.getOverwrite() && F().exists()) {
                F().delete();
            }
            if (!(options.getIntermediates() ? G().mkdirs() : G().mkdir())) {
                throw new s("directory already exists or could not be created");
            }
        }
    }

    public final FileSystemDirectory r0(String fileName) throws s, o {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Z();
        V(c.WRITE);
        k kVarO = F().o(fileName);
        if (kVarO != null) {
            return new FileSystemDirectory(kVarO.e());
        }
        throw new s("directory could not be created");
    }

    public final FileSystemFile s0(String mimeType, String fileName) throws s, o {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Z();
        V(c.WRITE);
        k kVarF = F();
        if (mimeType == null) {
            mimeType = "text/plain";
        }
        k kVarH = kVarF.h(mimeType, fileName);
        if (kVarH != null) {
            return new FileSystemFile(kVarH.e());
        }
        throw new s("file could not be created");
    }

    public final boolean t0() {
        if (t(c.READ)) {
            return F().isDirectory();
        }
        return false;
    }

    public final long u0() throws o {
        V(c.READ);
        Z();
        return kotlin.sequences.k.S(kotlin.sequences.k.N(kotlin.sequences.k.C(F().i(), new g()), new h()));
    }

    public final DirectoryInfo v0() throws o {
        Z();
        V(c.READ);
        if (!F().exists()) {
            return new DirectoryInfo(false, l.c(F().e().toString()), null, null, null, null, null, 124, null);
        }
        String strC = l.c(F().e().toString());
        List listP = F().p();
        ArrayList arrayList = new ArrayList();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            String fileName = ((k) it.next()).getFileName();
            if (fileName != null) {
                arrayList.add(fileName);
            }
        }
        return new DirectoryInfo(true, strC, arrayList, null, Long.valueOf(u0()), K(), z(), 8, null);
    }

    public final List y0() throws o {
        Z();
        V(c.READ);
        List<k> listP = F().p();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listP, 10));
        for (k kVar : listP) {
            String string = kVar.e().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Pair pairA = v.a("isDirectory", Boolean.valueOf(kVar.isDirectory()));
            if (!StringsKt.y(string, "/", false, 2, null)) {
                string = string + "/";
            }
            arrayList.add(N.l(pairA, v.a("uri", string)));
        }
        return arrayList;
    }

    public final boolean z0(CreateOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        return (F().exists() && options.getIdempotent()) ? false : true;
    }
}
