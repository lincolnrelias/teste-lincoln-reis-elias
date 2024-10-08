package com.example.testeaiko.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/testeaiko/adapters/VehicleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/testeaiko/adapters/VehicleAdapter$VehicleViewHolder;", "vehicles", "", "Lcom/example/testeaiko/datamodels/ModelVeiculo;", "onItemClick", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "VehicleViewHolder", "app_debug"})
public final class VehicleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.testeaiko.adapters.VehicleAdapter.VehicleViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.testeaiko.datamodels.ModelVeiculo> vehicles = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<com.example.testeaiko.datamodels.ModelVeiculo, kotlin.Unit> onItemClick = null;
    
    public VehicleAdapter(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.testeaiko.datamodels.ModelVeiculo> vehicles, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.testeaiko.datamodels.ModelVeiculo, kotlin.Unit> onItemClick) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.testeaiko.adapters.VehicleAdapter.VehicleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.testeaiko.adapters.VehicleAdapter.VehicleViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/testeaiko/adapters/VehicleAdapter$VehicleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/testeaiko/databinding/ArrivalsVehicleCardBinding;", "(Lcom/example/testeaiko/databinding/ArrivalsVehicleCardBinding;)V", "bind", "", "vehicle", "Lcom/example/testeaiko/datamodels/ModelVeiculo;", "onItemClick", "Lkotlin/Function1;", "app_debug"})
    public static final class VehicleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final com.example.testeaiko.databinding.ArrivalsVehicleCardBinding binding = null;
        
        public VehicleViewHolder(@org.jetbrains.annotations.NotNull
        com.example.testeaiko.databinding.ArrivalsVehicleCardBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.testeaiko.datamodels.ModelVeiculo vehicle, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.example.testeaiko.datamodels.ModelVeiculo, kotlin.Unit> onItemClick) {
        }
    }
}