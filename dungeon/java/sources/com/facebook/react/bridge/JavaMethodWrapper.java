package com.facebook.react.bridge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.AbstractC3952n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 32\u00020\u0001:\u000223B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010!\u001a\u00020\"H\u0002J/\u0010%\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00052\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010'J)\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\r2\u0010\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rH\u0002¢\u0006\u0002\u0010)J\b\u0010*\u001a\u00020\u0011H\u0002J\u0018\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0011H\u0002J\u0018\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010#\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010\u0015¨\u00064"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper;", "Lcom/facebook/react/bridge/JavaModuleWrapper$NativeMethod;", "moduleWrapper", "Lcom/facebook/react/bridge/JavaModuleWrapper;", "method", "Ljava/lang/reflect/Method;", "isSync", "", "<init>", "(Lcom/facebook/react/bridge/JavaModuleWrapper;Ljava/lang/reflect/Method;Z)V", "getMethod", "()Ljava/lang/reflect/Method;", "parameterTypes", "", "Ljava/lang/Class;", "[Ljava/lang/Class;", "paramLength", "", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "argumentsProcessed", "argumentExtractors", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "[Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "internalSignature", "arguments", "", "[Ljava/lang/Object;", "jsArgumentsNeeded", "processArguments", "", "signature", "getSignature", "buildSignature", "paramTypes", "(Ljava/lang/reflect/Method;[Ljava/lang/Class;Z)Ljava/lang/String;", "buildArgumentExtractors", "([Ljava/lang/Class;)[Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "calculateJSArgumentsNeeded", "getAffectedRange", "startIndex", "invoke", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "parameters", "Lcom/facebook/react/bridge/ReadableArray;", "ArgumentExtractor", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaMethodWrapper implements JavaModuleWrapper.NativeMethod {

    @NotNull
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY;

    @NotNull
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN;

    @NotNull
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK;

    @NotNull
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE;

    @NotNull
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC;

    @NotNull
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT;

    @NotNull
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER;

    @NotNull
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP;

    @NotNull
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE;

    @NotNull
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final boolean DEBUG;

    @Nullable
    private ArgumentExtractor<?>[] argumentExtractors;

    @Nullable
    private Object[] arguments;
    private boolean argumentsProcessed;

    @Nullable
    private String internalSignature;
    private int jsArgumentsNeeded;

    @NotNull
    private final Method method;

    @NotNull
    private final JavaModuleWrapper moduleWrapper;
    private final int paramLength;

    @NotNull
    private final Class<?>[] parameterTypes;

    @NotNull
    private String type;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\"\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J'\u0010\u0007\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H&¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "T", "", "<init>", "()V", "getJSArgumentsNeeded", "", "extractArgument", "jsInstance", "Lcom/facebook/react/bridge/JSInstance;", "jsArguments", "Lcom/facebook/react/bridge/ReadableArray;", "atIndex", "(Lcom/facebook/react/bridge/JSInstance;Lcom/facebook/react/bridge/ReadableArray;I)Ljava/lang/Object;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static abstract class ArgumentExtractor<T> {
        @Nullable
        public abstract T extractArgument(@NotNull JSInstance jsInstance, @NotNull ReadableArray jsArguments, int atIndex);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0014\u0010\u001e\u001a\u00020\u001b2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0014\u0010 \u001a\u00020\u001b2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002J\u0010\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/react/bridge/JavaMethodWrapper$Companion;", "", "<init>", "()V", "ARGUMENT_EXTRACTOR_BOOLEAN", "Lcom/facebook/react/bridge/JavaMethodWrapper$ArgumentExtractor;", "", "ARGUMENT_EXTRACTOR_DOUBLE", "", "ARGUMENT_EXTRACTOR_FLOAT", "", "ARGUMENT_EXTRACTOR_INTEGER", "", "ARGUMENT_EXTRACTOR_STRING", "", "ARGUMENT_EXTRACTOR_ARRAY", "Lcom/facebook/react/bridge/ReadableArray;", "ARGUMENT_EXTRACTOR_DYNAMIC", "Lcom/facebook/react/bridge/Dynamic;", "ARGUMENT_EXTRACTOR_MAP", "Lcom/facebook/react/bridge/ReadableMap;", "ARGUMENT_EXTRACTOR_CALLBACK", "Lcom/facebook/react/bridge/Callback;", "ARGUMENT_EXTRACTOR_PROMISE", "Lcom/facebook/react/bridge/Promise;", "DEBUG", "paramTypeToChar", "", "paramClass", "Ljava/lang/Class;", "returnTypeToChar", "returnClass", "commonTypeToChar", "typeClass", "createInvokeExceptionMessage", "traceName", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final char commonTypeToChar(Class<?> typeClass) {
            if (Intrinsics.b(typeClass, Boolean.TYPE)) {
                return 'z';
            }
            if (Intrinsics.b(typeClass, Boolean.class)) {
                return 'Z';
            }
            if (Intrinsics.b(typeClass, Integer.TYPE)) {
                return 'i';
            }
            if (Intrinsics.b(typeClass, Integer.class)) {
                return 'I';
            }
            if (Intrinsics.b(typeClass, Double.TYPE)) {
                return 'd';
            }
            if (Intrinsics.b(typeClass, Double.class)) {
                return 'D';
            }
            if (Intrinsics.b(typeClass, Float.TYPE)) {
                return 'f';
            }
            if (Intrinsics.b(typeClass, Float.class)) {
                return 'F';
            }
            return Intrinsics.b(typeClass, String.class) ? 'S' : (char) 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createInvokeExceptionMessage(String traceName) {
            return "Could not invoke " + traceName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char paramTypeToChar(Class<?> paramClass) {
            char cCommonTypeToChar = commonTypeToChar(paramClass);
            if (cCommonTypeToChar != 0) {
                return cCommonTypeToChar;
            }
            if (Intrinsics.b(paramClass, Callback.class)) {
                return 'X';
            }
            if (Intrinsics.b(paramClass, Promise.class)) {
                return 'P';
            }
            if (Intrinsics.b(paramClass, ReadableMap.class)) {
                return 'M';
            }
            if (Intrinsics.b(paramClass, ReadableArray.class)) {
                return 'A';
            }
            if (Intrinsics.b(paramClass, Dynamic.class)) {
                return 'Y';
            }
            throw new RuntimeException("Got unknown param class: " + paramClass.getSimpleName());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final char returnTypeToChar(Class<?> returnClass) {
            char cCommonTypeToChar = commonTypeToChar(returnClass);
            if (cCommonTypeToChar != 0) {
                return cCommonTypeToChar;
            }
            if (Intrinsics.b(returnClass, Void.TYPE)) {
                return 'v';
            }
            if (Intrinsics.b(returnClass, WritableMap.class)) {
                return 'M';
            }
            if (Intrinsics.b(returnClass, WritableArray.class)) {
                return 'A';
            }
            throw new RuntimeException("Got unknown return class: " + returnClass.getSimpleName());
        }
    }

    static {
        p348t6.b.a("JavaMethodWrapper", p348t6.a.ERROR);
        ARGUMENT_EXTRACTOR_BOOLEAN = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_BOOLEAN$1();
        ARGUMENT_EXTRACTOR_DOUBLE = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_DOUBLE$1();
        ARGUMENT_EXTRACTOR_FLOAT = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_FLOAT$1();
        ARGUMENT_EXTRACTOR_INTEGER = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_INTEGER$1();
        ARGUMENT_EXTRACTOR_STRING = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_STRING$1();
        ARGUMENT_EXTRACTOR_ARRAY = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_ARRAY$1();
        ARGUMENT_EXTRACTOR_DYNAMIC = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_DYNAMIC$1();
        ARGUMENT_EXTRACTOR_MAP = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_MAP$1();
        ARGUMENT_EXTRACTOR_CALLBACK = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_CALLBACK$1();
        ARGUMENT_EXTRACTOR_PROMISE = new JavaMethodWrapper$Companion$ARGUMENT_EXTRACTOR_PROMISE$1();
        DEBUG = p132h5.c.a().c(p150i5.a.f43754e);
    }

    public JavaMethodWrapper(@NotNull JavaModuleWrapper moduleWrapper, @NotNull Method method, boolean z10) {
        Intrinsics.checkNotNullParameter(moduleWrapper, "moduleWrapper");
        Intrinsics.checkNotNullParameter(method, "method");
        this.moduleWrapper = moduleWrapper;
        this.method = method;
        this.type = "async";
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        this.parameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.paramLength = length;
        if (z10) {
            setType("sync");
        } else {
            if (length <= 0 || !Intrinsics.b(parameterTypes[length - 1], Promise.class)) {
                return;
            }
            setType("promise");
        }
    }

    private final ArgumentExtractor<?>[] buildArgumentExtractors(Class<?>[] paramTypes) {
        ArgumentExtractor argumentExtractor;
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[paramTypes.length];
        int jSArgumentsNeeded = 0;
        while (jSArgumentsNeeded < paramTypes.length) {
            Class<?> cls = paramTypes[jSArgumentsNeeded];
            if (Intrinsics.b(cls, Boolean.class) || Intrinsics.b(cls, Boolean.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_BOOLEAN;
            } else if (Intrinsics.b(cls, Integer.class) || Intrinsics.b(cls, Integer.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_INTEGER;
            } else if (Intrinsics.b(cls, Double.class) || Intrinsics.b(cls, Double.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_DOUBLE;
            } else if (Intrinsics.b(cls, Float.class) || Intrinsics.b(cls, Float.TYPE)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_FLOAT;
            } else if (Intrinsics.b(cls, String.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_STRING;
            } else if (Intrinsics.b(cls, Callback.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_CALLBACK;
            } else if (Intrinsics.b(cls, Promise.class)) {
                if (jSArgumentsNeeded != paramTypes.length - 1) {
                    throw new IllegalStateException("Promise must be used as last parameter only");
                }
                argumentExtractor = ARGUMENT_EXTRACTOR_PROMISE;
            } else if (Intrinsics.b(cls, ReadableMap.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_MAP;
            } else if (Intrinsics.b(cls, ReadableArray.class)) {
                argumentExtractor = ARGUMENT_EXTRACTOR_ARRAY;
            } else {
                if (!Intrinsics.b(cls, Dynamic.class)) {
                    throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
                }
                argumentExtractor = ARGUMENT_EXTRACTOR_DYNAMIC;
            }
            argumentExtractorArr[jSArgumentsNeeded] = argumentExtractor;
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        return (ArgumentExtractor[]) AbstractC3952n.s0(argumentExtractorArr);
    }

    private final String buildSignature(Method method, Class<?>[] paramTypes, boolean isSync) {
        StringBuilder sb2 = new StringBuilder(paramTypes.length + 2);
        if (isSync) {
            Companion companion = INSTANCE;
            Class<?> returnType = method.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            sb2.append(companion.returnTypeToChar(returnType));
            sb2.append('.');
        } else {
            sb2.append("v.");
        }
        int length = paramTypes.length;
        for (int i10 = 0; i10 < length; i10++) {
            Class<?> cls = paramTypes[i10];
            if (Intrinsics.b(cls, Promise.class) && i10 != paramTypes.length - 1) {
                throw new IllegalStateException("Promise must be used as last parameter only");
            }
            sb2.append(INSTANCE.paramTypeToChar(cls));
        }
        return sb2.toString();
    }

    private final int calculateJSArgumentsNeeded() {
        ArgumentExtractor<?>[] argumentExtractorArr = this.argumentExtractors;
        if (argumentExtractorArr == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int jSArgumentsNeeded = 0;
        for (ArgumentExtractor<?> argumentExtractor : argumentExtractorArr) {
            jSArgumentsNeeded += argumentExtractor.getJSArgumentsNeeded();
        }
        return jSArgumentsNeeded;
    }

    private final String getAffectedRange(int startIndex, int jsArgumentsNeeded) {
        if (jsArgumentsNeeded <= 1) {
            return String.valueOf(startIndex);
        }
        return startIndex + "-" + ((jsArgumentsNeeded + startIndex) - 1);
    }

    private final void processArguments() {
        if (this.argumentsProcessed) {
            return;
        }
        p295q7.b.a(0L, "processArguments").b("method", this.moduleWrapper.getName() + "." + this.method.getName()).c();
        try {
            this.argumentsProcessed = true;
            this.argumentExtractors = buildArgumentExtractors(this.parameterTypes);
            this.internalSignature = buildSignature(this.method, this.parameterTypes, Intrinsics.b(getType(), "sync"));
            this.arguments = new Object[this.parameterTypes.length];
            this.jsArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            p295q7.b.b(0L).c();
        }
    }

    @NotNull
    public final Method getMethod() {
        return this.method;
    }

    @Nullable
    public final String getSignature() {
        if (!this.argumentsProcessed) {
            processArguments();
        }
        String str = this.internalSignature;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    @NotNull
    public String getType() {
        return this.type;
    }

    @Override // com.facebook.react.bridge.JavaModuleWrapper.NativeMethod
    public void invoke(@NotNull JSInstance jsInstance, @NotNull ReadableArray parameters) {
        Intrinsics.checkNotNullParameter(jsInstance, "jsInstance");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        String str = this.moduleWrapper.getName() + "." + this.method.getName();
        p295q7.b.a(0L, "callJavaModuleMethod").b("method", str).c();
        if (DEBUG) {
            p132h5.c.a().b(p150i5.a.f43754e, "JS->Java: %s.%s()", this.moduleWrapper.getName(), this.method.getName());
        }
        try {
            if (!this.argumentsProcessed) {
                processArguments();
            }
            Object[] objArr = this.arguments;
            if (objArr == null) {
                throw new IllegalArgumentException("processArguments failed: 'arguments' is null.");
            }
            ArgumentExtractor<?>[] argumentExtractorArr = this.argumentExtractors;
            if (argumentExtractorArr == null) {
                throw new IllegalArgumentException("processArguments failed: 'argumentExtractors' is null.");
            }
            if (this.jsArgumentsNeeded != parameters.size()) {
                throw new NativeArgumentsParseException(str + " got " + parameters.size() + " arguments, expected " + this.jsArgumentsNeeded);
            }
            int jSArgumentsNeeded = 0;
            for (int i10 = 0; i10 < argumentExtractorArr.length; i10++) {
                try {
                    objArr[i10] = argumentExtractorArr[i10].extractArgument(jsInstance, parameters, jSArgumentsNeeded);
                    jSArgumentsNeeded += argumentExtractorArr[i10].getJSArgumentsNeeded();
                } catch (UnexpectedNativeTypeException e10) {
                    throw new NativeArgumentsParseException(e10.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(jSArgumentsNeeded, argumentExtractorArr[i10].getJSArgumentsNeeded()) + ")", e10);
                } catch (NullPointerException e11) {
                    throw new NativeArgumentsParseException(e11.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(jSArgumentsNeeded, argumentExtractorArr[i10].getJSArgumentsNeeded()) + ")", e11);
                }
            }
            try {
                this.method.invoke(this.moduleWrapper.getModule(), Arrays.copyOf(objArr, objArr.length));
                p295q7.b.b(0L).c();
            } catch (IllegalAccessException e12) {
                throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(str), e12);
            } catch (IllegalArgumentException e13) {
                throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(str), e13);
            } catch (InvocationTargetException e14) {
                if (!(e14.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException(INSTANCE.createInvokeExceptionMessage(str), e14);
                }
                Throwable cause = e14.getCause();
                Intrinsics.d(cause, "null cannot be cast to non-null type java.lang.RuntimeException");
                throw ((RuntimeException) cause);
            }
        } catch (Throwable th) {
            p295q7.b.b(0L).c();
            throw th;
        }
    }

    public void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
