package expo.modules.filesystem;

import Nb.b;
import Rb.d;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import expo.modules.kotlin.sharedobjects.SharedObject;
import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.io.j;
import kotlin.jvm.internal.Intrinsics;
import p407wb.c;
import p407wb.l;
import p407wb.m;
import p407wb.s;
import p407wb.t;
import p443yb.a;
import p443yb.h;
import p443yb.i;
import p443yb.k;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0005R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0011\u0010,\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0011\u0010/\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u00103\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0013\u00105\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, d2 = {"Lexpo/modules/filesystem/FileSystemPath;", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "", "x", "()V", "Z", "destination", "Ljava/io/File;", "L", "(Lexpo/modules/filesystem/FileSystemPath;)Ljava/io/File;", "LNb/c;", "permission", "V", "(LNb/c;)V", "", "t", "(LNb/c;)Z", "Lexpo/modules/filesystem/CreateOptions;", "options", "U", "(Lexpo/modules/filesystem/CreateOptions;)V", "to", "u", "(Lexpo/modules/filesystem/FileSystemPath;)V", "P", "", "newName", "S", "(Ljava/lang/String;)V", "c", "Landroid/net/Uri;", "O", "()Landroid/net/Uri;", "setUri", "Lyb/k;", "d", "Lyb/k;", "fileAdapter", "F", "()Lyb/k;", "file", "G", "()Ljava/io/File;", "javaFile", "", "K", "()Ljava/lang/Long;", "modificationTime", "z", "creationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FileSystemPath extends SharedObject {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Uri uri;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k fileAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemPath(Uri uri) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
    }

    public final k F() {
        k hVar;
        Context contextA;
        Context contextA2;
        k kVar = this.fileAdapter;
        if (Intrinsics.b(kVar != null ? kVar.e() : null, this.uri)) {
            return kVar;
        }
        if (l.b(this.uri)) {
            d dVarD = d();
            if (dVarD == null || (contextA2 = dVarD.A()) == null) {
                throw new Exception("No context");
            }
            hVar = new i(contextA2, this.uri);
        } else if (l.a(this.uri)) {
            d dVarD2 = d();
            if (dVarD2 == null || (contextA = dVarD2.A()) == null) {
                throw new Exception("No context");
            }
            hVar = new a(contextA, this.uri);
        } else {
            hVar = new h(this.uri);
        }
        this.fileAdapter = hVar;
        return hVar;
    }

    public final File G() throws Exception {
        if (!l.b(this.uri)) {
            Object objF = F();
            Intrinsics.d(objF, "null cannot be cast to non-null type java.io.File");
            return (File) objF;
        }
        throw new Exception("This method cannot be used with content URIs: " + this.uri);
    }

    public final Long K() {
        Z();
        return F().s();
    }

    public final File L(FileSystemPath destination) throws c, p407wb.a {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!(destination instanceof FileSystemDirectory)) {
            if (!(this instanceof FileSystemFile)) {
                throw new p407wb.a();
            }
            File parentFile = destination.G().getParentFile();
            if (parentFile == null || !parentFile.exists()) {
                throw new c();
            }
            return destination.G();
        }
        if (this instanceof FileSystemFile) {
            if (((FileSystemDirectory) destination).t0()) {
                return new File(destination.G(), G().getName());
            }
            throw new c();
        }
        if (((FileSystemDirectory) destination).t0()) {
            return new File(destination.G(), G().getName());
        }
        File parentFile2 = destination.G().getParentFile();
        if (parentFile2 == null || !parentFile2.exists()) {
            throw new c();
        }
        return destination.G();
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    public final void P(FileSystemPath to) throws c, p407wb.a {
        Intrinsics.checkNotNullParameter(to, "to");
        Z();
        to.Z();
        Nb.c cVar = Nb.c.WRITE;
        V(cVar);
        to.V(cVar);
        if (Build.VERSION.SDK_INT < 26) {
            j.x(G(), L(to), false, 0, 6, null);
            G().delete();
            this.uri = Uri.fromFile(L(to));
            return;
        }
        File fileL = L(to);
        Path path = G().toPath();
        Intrinsics.checkNotNullExpressionValue(path, "toPath(...)");
        Path path2 = fileL.toPath();
        Intrinsics.checkNotNullExpressionValue(path2, "toPath(...)");
        Intrinsics.checkNotNullExpressionValue(Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
        this.uri = Uri.fromFile(fileL);
    }

    public final void S(String newName) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        Z();
        V(Nb.c.WRITE);
        File file = new File(G().getParent(), newName);
        if (Build.VERSION.SDK_INT < 26) {
            j.x(G(), file, false, 0, 6, null);
            G().delete();
            this.uri = Uri.fromFile(file);
        } else {
            Path path = G().toPath();
            Intrinsics.checkNotNullExpressionValue(path, "toPath(...)");
            Path path2 = file.toPath();
            Intrinsics.checkNotNullExpressionValue(path2, "toPath(...)");
            Intrinsics.checkNotNullExpressionValue(Files.move(path, path2, (CopyOption[]) Arrays.copyOf(new CopyOption[0], 0)), "move(...)");
            this.uri = Uri.fromFile(file);
        }
    }

    public final void U(CreateOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!options.getOverwrite() && F().exists()) {
            throw new s("it already exists");
        }
    }

    public final void V(Nb.c permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (!t(permission)) {
            throw new m(permission);
        }
    }

    public abstract void Z();

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public final boolean t(Nb.c permission) {
        EnumSet enumSetNoneOf;
        b bVarT;
        Intrinsics.checkNotNullParameter(permission, "permission");
        if (l.b(this.uri) || l.a(this.uri)) {
            return true;
        }
        d dVarD = d();
        if (dVarD == null || (bVarT = dVarD.t()) == null) {
            enumSetNoneOf = EnumSet.noneOf(Nb.c.class);
        } else {
            d dVarD2 = d();
            enumSetNoneOf = bVarT.a(dVarD2 != null ? dVarD2.A() : null, G().getPath());
            if (enumSetNoneOf == null) {
                enumSetNoneOf = EnumSet.noneOf(Nb.c.class);
            }
        }
        return enumSetNoneOf.contains(permission);
    }

    public final void u(FileSystemPath to) {
        Intrinsics.checkNotNullParameter(to, "to");
        Z();
        to.Z();
        V(Nb.c.READ);
        to.V(Nb.c.WRITE);
        j.u(G(), L(to), false, null, 6, null);
    }

    public final void x() throws t {
        if (!F().exists()) {
            throw new t("uri '" + F().e() + "' does not exist");
        }
        if (F().isDirectory()) {
            if (F().r()) {
                return;
            }
            throw new t("failed to delete '" + F().e() + "'");
        }
        if (F().delete()) {
            return;
        }
        throw new t("failed to delete '" + F().e() + "'");
    }

    public final Long z() {
        return F().getCreationTime();
    }
}
