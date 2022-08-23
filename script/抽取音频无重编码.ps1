
ls *.flv,*mp4 | foreach{
    Write-Output ($_.Name)
    ffmpeg -i $_.Name -vn -acodec copy ($_.Name -replace "\.flv",".aac")

}

pause