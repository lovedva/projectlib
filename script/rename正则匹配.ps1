ls *.m4a | foreach{
    if ($_.Name.Contains("《宁向东管理学课》")){
    } else {
        Write-Output ($_.Name)
        ren $_.name ($_.Name -replace '\b.m4a', '《宁向东管理学》.m4a')
    }
}
