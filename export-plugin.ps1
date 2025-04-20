# File: export-plugin.ps1
# Description: Recursively appends all plugin source/config files into plugin-dump.txt
# Usage: Run from plugin root (e.g., ironman-questing-helper)

# Output file
$outFile = "plugin-dump.txt"
if (Test-Path $outFile) { Remove-Item $outFile }

# File extensions to include
$extensions = @("*.java", "*.json", "*.kt", "*.kts", "*.md", "*.properties")

# Recursively find and export
foreach ($ext in $extensions) {
    Get-ChildItem -Recurse -Include $ext | ForEach-Object {
        Add-Content -Path $outFile -Value "`n`n// ===== FILE: $($_.FullName.Replace($PWD.Path, '').TrimStart('\')) =====`n"
        Get-Content $_.FullName | Add-Content -Path $outFile
    }
}

Write-Host "`n✅ Export complete: plugin-dump.txt"
