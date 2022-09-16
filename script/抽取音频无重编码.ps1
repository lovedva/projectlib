$ext="flv","mp4"

Set-Location $PSScriptRoot
foreach ($item in $ext){
    Get-ChildItem $PSScriptRoot/*.$item | ForEach-Object{
        Write-Output ($_.Name)
        ffmpeg -i $_.Name -vn -acodec copy ($_.Name -replace "\.$item",".aac")
    
    }
}


pause