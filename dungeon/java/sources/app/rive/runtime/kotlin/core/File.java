package app.rive.runtime.kotlin.core;

import app.rive.runtime.kotlin.core.errors.ArtboardException;
import app.rive.runtime.kotlin.core.errors.RiveException;
import app.rive.runtime.kotlin.core.errors.ViewModelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0001BB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000fH\u0016J\u0019\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\nH\u0095 J\u0019\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u000fH\u0092 J\u0011\u0010(\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0092 J\u0019\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u0006\u0010\"\u001a\u00020\nH\u0092 J\u0019\u0010*\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\u000fH\u0092 J\u0011\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0092 J\u0019\u0010,\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010-\u001a\u00020%H\u0092 J\u0011\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%H\u0096 J\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010&\u001a\u00020%H\u0092 J\u0019\u00102\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u00103\u001a\u00020\nH\u0092 J\u0019\u00104\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u00105\u001a\u00020\u000fH\u0095 J\u0011\u00106\u001a\u00020\n2\u0006\u0010&\u001a\u00020%H\u0092 J\u0010\u00107\u001a\u0002082\u0006\u0010#\u001a\u00020\u000fH\u0016J\b\u00109\u001a\u000208H\u0016J\u0010\u0010:\u001a\u00020;2\u0006\u0010!\u001a\u00020\u0016H\u0016J\u0010\u0010<\u001a\u00020;2\u0006\u00103\u001a\u00020\nH\u0016J\u0010\u0010=\u001a\u00020;2\u0006\u00105\u001a\u00020\u000fH\u0016J)\u0010>\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010?\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010@\u001a\u00020%H\u0092 J\b\u0010A\u001a\u00020\nH\u0016R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\f¨\u0006C"}, d2 = {"Lapp/rive/runtime/kotlin/core/File;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "bytes", "", "rendererType", "Lapp/rive/runtime/kotlin/core/RendererType;", "fileAssetLoader", "Lapp/rive/runtime/kotlin/core/FileAssetLoader;", "([BLapp/rive/runtime/kotlin/core/RendererType;Lapp/rive/runtime/kotlin/core/FileAssetLoader;)V", "artboardCount", "", "getArtboardCount", "()I", "artboardNames", "", "", "getArtboardNames", "()Ljava/util/List;", "enums", "Lapp/rive/runtime/kotlin/core/File$Enum;", "getEnums", "firstArtboard", "Lapp/rive/runtime/kotlin/core/Artboard;", "getFirstArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "getRendererType", "()Lapp/rive/runtime/kotlin/core/RendererType;", "viewModelCount", "getViewModelCount", "artboard", "index", "name", "cppArtboardByIndex", "", "cppPointer", "cppArtboardByName", "cppArtboardCount", "cppArtboardNameByIndex", "cppCreateBindableArtboardByName", "cppCreateDefaultBindableArtboard", "cppDefaultViewModelForArtboard", "artboardPointer", "cppDelete", "", "pointer", "cppEnums", "cppViewModelByIndex", "viewModelIdx", "cppViewModelByName", "viewModelName", "cppViewModelCount", "createBindableArtboardByName", "Lapp/rive/runtime/kotlin/core/BindableArtboard;", "createDefaultBindableArtboard", "defaultViewModelForArtboard", "Lapp/rive/runtime/kotlin/core/ViewModel;", "getViewModelByIndex", "getViewModelByName", "import", "length", "fileAssetLoaderPointer", "release", "Enum", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class File extends NativeObject {
    public static final int $stable = 8;

    @NotNull
    private final ReentrantLock lock;

    @NotNull
    private final RendererType rendererType;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lapp/rive/runtime/kotlin/core/File$Enum;", "", "name", "", "values", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Enum {
        public static final int $stable = 8;

        @NotNull
        private final String name;

        @NotNull
        private final List<String> values;

        public Enum(@NotNull String name, @NotNull List<String> values) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(values, "values");
            this.name = name;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Enum copy$default(Enum r10, String str, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = r10.name;
            }
            if ((i10 & 2) != 0) {
                list = r10.values;
            }
            return r10.copy(str, list);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final List<String> component2() {
            return this.values;
        }

        @NotNull
        public final Enum copy(@NotNull String name, @NotNull List<String> values) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(values, "values");
            return new Enum(name, values);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Enum)) {
                return false;
            }
            Enum r10 = (Enum) other;
            return Intrinsics.b(this.name, r10.name) && Intrinsics.b(this.values, r10.values);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final List<String> getValues() {
            return this.values;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.values.hashCode();
        }

        @NotNull
        public String toString() {
            return "Enum(name=" + this.name + ", values=" + this.values + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public File(@NotNull byte[] bytes, @NotNull RendererType rendererType, @Nullable FileAssetLoader fileAssetLoader) {
        super(0L);
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(rendererType, "rendererType");
        this.rendererType = rendererType;
        if (fileAssetLoader != null) {
            fileAssetLoader.setRendererType(getRendererType());
            fileAssetLoader.acquire();
            getDependencies().add(fileAssetLoader);
        }
        setCppPointer(m243import(bytes, bytes.length, getRendererType().getValue(), fileAssetLoader != null ? fileAssetLoader.getCppPointer() : 0L));
        getRefs().incrementAndGet();
        this.lock = new ReentrantLock();
    }

    public /* synthetic */ File(byte[] bArr, RendererType rendererType, FileAssetLoader fileAssetLoader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i10 & 2) != 0 ? Rive.INSTANCE.getDefaultRendererType() : rendererType, (i10 & 4) != 0 ? null : fileAssetLoader);
    }

    private native long cppArtboardByName(long cppPointer, String name);

    private native int cppArtboardCount(long cppPointer);

    private native String cppArtboardNameByIndex(long cppPointer, int index);

    private native long cppCreateBindableArtboardByName(long cppPointer, String name);

    private native long cppCreateDefaultBindableArtboard(long cppPointer);

    private native long cppDefaultViewModelForArtboard(long cppPointer, long artboardPointer);

    private native List<Enum> cppEnums(long cppPointer);

    private native long cppViewModelByIndex(long cppPointer, int viewModelIdx);

    private native int cppViewModelCount(long cppPointer);

    /* JADX INFO: renamed from: import, reason: not valid java name */
    private native long m243import(byte[] bytes, int length, int rendererType, long fileAssetLoaderPointer);

    @NotNull
    public Artboard artboard(int index) throws RiveException {
        long jCppArtboardByIndex = cppArtboardByIndex(getCppPointer(), index);
        if (jCppArtboardByIndex != 0) {
            Artboard artboard = new Artboard(jCppArtboardByIndex, getLock(), this);
            getDependencies().add(artboard);
            return artboard;
        }
        throw new ArtboardException("No Artboard found at index " + index + ".");
    }

    @NotNull
    public Artboard artboard(@NotNull String name) throws RiveException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppArtboardByName = cppArtboardByName(getCppPointer(), name);
        if (jCppArtboardByName != 0) {
            Artboard artboard = new Artboard(jCppArtboardByName, getLock(), this);
            getDependencies().add(artboard);
            return artboard;
        }
        List<String> artboardNames = getArtboardNames();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(artboardNames, 10));
        Iterator<T> it = artboardNames.iterator();
        while (it.hasNext()) {
            arrayList.add("\"" + ((String) it.next()) + "\"");
        }
        throw new ArtboardException("Artboard \"" + name + "\" not found. Available Artboards: " + arrayList);
    }

    protected native long cppArtboardByIndex(long cppPointer, int index);

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    protected native long cppViewModelByName(long cppPointer, @NotNull String viewModelName);

    @NotNull
    public BindableArtboard createBindableArtboardByName(@NotNull String name) throws ArtboardException {
        Intrinsics.checkNotNullParameter(name, "name");
        long jCppCreateBindableArtboardByName = cppCreateBindableArtboardByName(getCppPointer(), name);
        if (jCppCreateBindableArtboardByName != 0) {
            BindableArtboard bindableArtboard = new BindableArtboard(jCppCreateBindableArtboardByName);
            getDependencies().add(bindableArtboard);
            return bindableArtboard;
        }
        throw new ArtboardException("No BindableArtboard found with name " + name + ".");
    }

    @NotNull
    public BindableArtboard createDefaultBindableArtboard() throws ArtboardException {
        long jCppCreateDefaultBindableArtboard = cppCreateDefaultBindableArtboard(getCppPointer());
        if (jCppCreateDefaultBindableArtboard == 0) {
            throw new ArtboardException("No default BindableArtboard.");
        }
        BindableArtboard bindableArtboard = new BindableArtboard(jCppCreateDefaultBindableArtboard);
        getDependencies().add(bindableArtboard);
        return bindableArtboard;
    }

    @NotNull
    public ViewModel defaultViewModelForArtboard(@NotNull Artboard artboard) throws ViewModelException {
        Intrinsics.checkNotNullParameter(artboard, "artboard");
        long jCppDefaultViewModelForArtboard = cppDefaultViewModelForArtboard(getCppPointer(), artboard.getCppPointer());
        if (jCppDefaultViewModelForArtboard != 0) {
            ViewModel viewModel = new ViewModel(jCppDefaultViewModelForArtboard);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No default ViewModel found for artboard " + artboard.getName() + ".");
    }

    public int getArtboardCount() {
        return cppArtboardCount(getCppPointer());
    }

    @NotNull
    public List<String> getArtboardNames() {
        IntRange intRangeT = e.t(0, getArtboardCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.w(intRangeT, 10));
        Iterator it = intRangeT.iterator();
        while (it.hasNext()) {
            arrayList.add(cppArtboardNameByIndex(getCppPointer(), ((K) it).nextInt()));
        }
        return arrayList;
    }

    @NotNull
    public List<Enum> getEnums() {
        return cppEnums(getCppPointer());
    }

    @NotNull
    public Artboard getFirstArtboard() throws RiveException {
        return artboard(0);
    }

    @NotNull
    public ReentrantLock getLock() {
        return this.lock;
    }

    @NotNull
    public RendererType getRendererType() {
        return this.rendererType;
    }

    @NotNull
    public ViewModel getViewModelByIndex(int viewModelIdx) throws ViewModelException {
        long jCppViewModelByIndex = cppViewModelByIndex(getCppPointer(), viewModelIdx);
        if (jCppViewModelByIndex != 0) {
            ViewModel viewModel = new ViewModel(jCppViewModelByIndex);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No ViewModel found at index " + viewModelIdx + ".");
    }

    @NotNull
    public ViewModel getViewModelByName(@NotNull String viewModelName) throws ViewModelException {
        Intrinsics.checkNotNullParameter(viewModelName, "viewModelName");
        long jCppViewModelByName = cppViewModelByName(getCppPointer(), viewModelName);
        if (jCppViewModelByName != 0) {
            ViewModel viewModel = new ViewModel(jCppViewModelByName);
            getDependencies().add(viewModel);
            return viewModel;
        }
        throw new ViewModelException("No ViewModel found with name " + viewModelName + ".");
    }

    public int getViewModelCount() {
        return cppViewModelCount(getCppPointer());
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject, app.rive.runtime.kotlin.core.RefCount
    public int release() {
        int iRelease;
        synchronized (getLock()) {
            iRelease = super.release();
        }
        return iRelease;
    }
}
